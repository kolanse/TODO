package com.example.componentlibrary.atom.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.componentlibrary.ToDoTypography

@Composable
internal fun createTextStyle(
    textColor: Color,
    backgroundColor: Color,
    textAlign: TextAlign,
    typography: ToDoTypography,
): TextStyle {
    return when (typography) {
        ToDoTypography.Display01Bold -> MaterialTheme.typography.displayMedium.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W700,
            fontSize = 40.sp,
            lineHeight = 40.sp,
        )

        ToDoTypography.Display01SemiBold -> MaterialTheme.typography.displayMedium.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W500,
            fontSize = 40.sp,
            lineHeight = 40.sp,
        )

        ToDoTypography.Display01Light -> MaterialTheme.typography.displayMedium.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W300,
            fontSize = 40.sp,
            lineHeight = 40.sp,
        )

        ToDoTypography.HeadingLargeBold -> MaterialTheme.typography.headlineLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W700,
            fontSize = 32.sp,
            lineHeight = 30.sp,
        )

        ToDoTypography.HeadingMediumMedium -> MaterialTheme.typography.headlineLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W500,
            fontSize = 30.sp,
            lineHeight = 25.sp,
        )

        ToDoTypography.HeadingMediumBold -> MaterialTheme.typography.headlineLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W700,
            fontSize = 30.sp,
            lineHeight = 25.sp,
        )

        ToDoTypography.HeadingSmallLight -> MaterialTheme.typography.headlineLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W300,
            fontSize = 20.sp,
            lineHeight = 20.sp,
        )

        ToDoTypography.HeadingSmallMedium -> MaterialTheme.typography.headlineLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W500,
            fontSize = 20.sp,
            lineHeight = 20.sp,
        )

        ToDoTypography.HeadingSmallBold -> MaterialTheme.typography.headlineLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W700,
            fontSize = 20.sp,
            lineHeight = 20.sp,
        )

        ToDoTypography.HeadingXSmallLight -> MaterialTheme.typography.headlineLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W300,
            fontSize = 16.sp,
            lineHeight = 20.sp,
        )

        ToDoTypography.HeadingXSmallMedium -> MaterialTheme.typography.headlineLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W500,
            fontSize = 16.sp,
            lineHeight = 20.sp,
        )

        ToDoTypography.HeadingXSmallBold -> MaterialTheme.typography.headlineLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W700,
            fontSize = 16.sp,
            lineHeight = 20.sp,
        )

        ToDoTypography.ContentLargeLight -> MaterialTheme.typography.bodyLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W300,
            fontSize = 12.sp,
            lineHeight = 15.sp,
        )

        ToDoTypography.ContentLargeMedium -> MaterialTheme.typography.bodyLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W500,
            fontSize = 12.sp,
            lineHeight = 15.sp,
        )

        ToDoTypography.ContentLargeBold -> MaterialTheme.typography.bodyLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W700,
            fontSize = 12.sp,
            lineHeight = 15.sp,
        )

        ToDoTypography.ContentMediumLight -> MaterialTheme.typography.bodyLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W300,
            fontSize = 10.sp,
            lineHeight = 15.sp,
        )

        ToDoTypography.ContentMediumMedium -> MaterialTheme.typography.bodyLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W500,
            fontSize = 10.sp,
            lineHeight = 15.sp,
        )

        ToDoTypography.ContentMediumBold -> MaterialTheme.typography.bodyLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W700,
            fontSize = 10.sp,
            lineHeight = 15.sp,
        )

        ToDoTypography.ContentSmallLight -> MaterialTheme.typography.bodyLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W300,
            fontSize = 8.sp,
            lineHeight = 15.sp,
        )

        ToDoTypography.ContentSmallMedium -> MaterialTheme.typography.bodyLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W500,
            fontSize = 8.sp,
            lineHeight = 15.sp,
        )

        ToDoTypography.ContentSmallBold -> MaterialTheme.typography.bodyLarge.copy(
            color = textColor,
            background = backgroundColor,
            textAlign = textAlign,
            fontWeight = FontWeight.W700,
            fontSize = 8.sp,
            lineHeight = 15.sp,
        )
    }
}
