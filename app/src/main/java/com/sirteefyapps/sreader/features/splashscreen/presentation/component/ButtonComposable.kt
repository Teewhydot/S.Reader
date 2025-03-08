package com.sirteefyapps.sreader.features.splashscreen.presentation.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sirteefyapps.sreader.ui.theme.ButtonColor
import com.sirteefyapps.sreader.ui.theme.buttonTextStyle


@Composable
fun ButtonComposable(modifier: Modifier, buttonText: String, onClick: () -> Unit) {
    Surface(
        modifier = modifier
            .width(230.dp)
            .height(50.dp)
            .clickable {
                onClick()
            },
        color = ButtonColor,
        shape = RoundedCornerShape(10.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = buttonText, style = buttonTextStyle)
        }
    }
}
