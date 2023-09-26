package com.example.todo.ui.components.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.todo.ui.theme.black

@Composable
fun TitleTextLarge(
    text: String,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = black,
    fontSize: TextUnit = 40.sp,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    textStyle: TextStyle = MaterialTheme.typography.titleLarge.copy(
        color = color, fontWeight = FontWeight.Bold, fontSize = fontSize
    )
) {
    Text(
        text = text, style = textStyle, modifier = modifier,
        lineHeight = 25.sp,
        maxLines = maxLines, overflow = overflow, textAlign = textAlign
    )
}

@Composable
fun BodyText(
    text: String,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = MaterialTheme.colorScheme.onBackground.copy(0.7f),
    maxlines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium.copy(color = color)
) {
    Text(
        text = text,
        style = textStyle,
        modifier = modifier,
        maxLines = maxlines,
        overflow = overflow,
        textAlign = textAlign
    )
}