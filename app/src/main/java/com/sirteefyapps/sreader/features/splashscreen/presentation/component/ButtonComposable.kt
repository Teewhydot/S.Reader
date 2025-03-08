package com.sirteefyapps.sreader.features.splashscreen.presentation.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.sirteefyapps.sreader.ui.theme.ButtonColor


@Composable
fun ButtonComposable(modifier: Modifier, buttonText: String, onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .width(230.dp)
            .height(50.dp)
            .clickable {
                onClick()
            },
        color = ButtonColor,
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = buttonText,
            modifier = modifier,
            style = MaterialTheme.typography.headlineSmall.copy(
                color = Color.White
            ),
            textAlign = TextAlign.Center,
        )
    }
}
