package com.example.todo.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.updateTransition
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.todo.R
import com.example.todo.navigation.Screens
import com.example.todo.ui.theme.black
import com.example.todo.ui.theme.white
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    var showLogo by remember { mutableStateOf(false) }
    var boxState by remember { mutableStateOf(BoxState()) }
    val transition = updateTransition(targetState = boxState, label = "box state")
    val shape by transition.animateDp(
        transitionSpec = { spring(stiffness = Spring.StiffnessLow) },
        label = "shape"
    ) { it.shape }
    val color by transition.animateColor(
        transitionSpec = { spring(stiffness = Spring.StiffnessLow) },
        label = "color"
    ) { it.color }
    val scale by transition.animateFloat(
        transitionSpec = { spring(stiffness = Spring.StiffnessLow) },
        label = "scale"
    ) { it.scale }
    val verticalOffset by transition.animateDp(
        transitionSpec = { spring(stiffness = Spring.StiffnessLow, dampingRatio = Spring.DampingRatioLowBouncy) },
        label = "vOffset",
    ) { it.verticalOffset }
    val horizontalOffset by transition.animateDp(
        transitionSpec = { spring(stiffness = Spring.StiffnessLow) },
        label = "hOffset"
    ) { it.horizontalOffset }
    val rotation by transition.animateFloat(
        transitionSpec = { spring(stiffness = Spring.StiffnessLow) },
        label = "rotation"
    ) { it.rotation }

    LaunchedEffect(true) {
        boxState = boxState.copy(verticalOffset = 0.dp)
        delay(1000)
        boxState = boxState.copy(scale = 1.2f, rotation = 45f)
        delay(1000)
        boxState = boxState.copy(rotation = 90f)
        delay(1000)
        showLogo = true
        boxState = boxState.copy(horizontalOffset = 64.dp, scale = 0.5f, shape = 50.dp)
        delay(1000)
        boxState = boxState.copy(scale = 80f)
        boxState = boxState.copy(color = black)
        delay(300)

        navController.navigate(Screens.Dashboard.route) {
            popUpTo(Screens.Splash.route) {
                inclusive = true
            }
        }
    }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(black),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .offset(x = horizontalOffset, y = verticalOffset)
                .scale(scale)
                .rotate(rotation)
                .width(47.dp)
                .height(47.dp)
                .clip(RoundedCornerShape(shape))
                .background(white),
        )

        AnimatedVisibility(
            visible = showLogo,
            enter = fadeIn()
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_dirac_logo), contentDescription = "dirac logo", tint = color)
        }
    }
}

data class BoxState(
    var shape: Dp = 10.dp,
    var color: Color = white,
    var verticalOffset: Dp = 50.dp,
    val horizontalOffset: Dp = 0.dp,
    val scale: Float = 1.0f,
    val rotation: Float = 0.0f
)