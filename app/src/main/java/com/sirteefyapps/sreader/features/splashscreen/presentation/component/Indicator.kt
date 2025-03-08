package com.sirteefyapps.sreader.features.splashscreen.presentation.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun IndicatorComposable(activeIndex: Int) {
    Row {
        for (i in 0..2) {
            Spacer(modifier = Modifier
                .width(10.dp)
                .padding(10.dp))
            IndicatorItemComposable(active = i == activeIndex)
        }
    }
}

@Composable
fun IndicatorItemComposable(active: Boolean) {
    Surface(
        modifier = Modifier
            .width(
                if (active) 30.dp else 10.dp
            )
            .height(10.dp),
        shape = RoundedCornerShape(10.dp),
        color = if (active) Color.Green else Color.Gray
    ) {

    }
}
