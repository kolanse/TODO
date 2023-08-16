package com.example.componentlibrary.atom.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ToDoText(
    text: String,
    modifier: Modifier = Modifier,
    toDoTextStyle: ToDoTextStyle,
    backgroundColor: Color = Color.Unspecified,
    textAlign: TextAlign = TextAlign.Start,
    maxLine: Int = Int.MAX_VALUE,
) {
    Text(
        text = text,
        modifier = modifier,
        style = createTextStyle(
            textColor = toDoTextStyle.color,
            backgroundColor = backgroundColor,
            textAlign = textAlign,
            typography = toDoTextStyle.typography,
        ),
    )
}
