package com.example.componentlibrary.atom.text

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.componentlibrary.ToDoTypography

@Preview
@Composable
fun ToDoTextPreview() {
    Box(modifier = Modifier.width(400.dp)) {
        Column {
            ToDoText(
                text = "We are Here to Serve you",
                toDoTextStyle = ToDoTextStyle(
                    ToDoTypography.ContentLargeBold,
                    Color.Black,
                ),
                modifier = Modifier,
            )
        }
    }
}
