package com.example.todo.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.estimateAnimationDurationMillis
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todo.R
import com.example.todo.ui.components.button.FilledButton
import com.example.todo.ui.components.text.TitleTextLarge
import com.example.todo.ui.theme.black
import com.example.todo.ui.theme.white
import kotlinx.coroutines.delay

@Composable
fun Dashboard() {
    var dPosition by remember{ mutableStateOf(0.dp) }
    val verticalOffset by animateDpAsState(
        targetValue = dPosition,
        animationSpec = spring(stiffness = Spring.StiffnessLow, dampingRatio = Spring.DampingRatioLowBouncy),
        label = "vertical offset"
    )
    var showLogin by remember { mutableStateOf(false) }

    LaunchedEffect(true) {
        delay(800)
        dPosition = -40.dp
        showLogin = true
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(white),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_dirac_logo),
            contentDescription = "dirac logo",
            tint = black,
            modifier = Modifier.offset(y = verticalOffset)
        )

        AnimatedVisibility(
            visible = showLogin,
            enter = fadeIn()
        ) {
            Spacer(modifier = Modifier.height(25.dp))
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TitleTextLarge(
                    text = stringResource(id = R.string.lets_get_better_everyday),
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(42.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    TextButton(
                        onClick = {},
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(black)
                            .width(123.dp)
                    ) {
                        Text(text = stringResource(id = R.string.sign_in), color = white)
                    }
                    TextButton(
                        onClick = {},
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(black)
                            .width(123.dp)
                    ) {
                        Text(text = stringResource(id = R.string.log_in), color = white)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DashboardPreview() {
    Dashboard()
}