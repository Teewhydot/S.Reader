package com.sirteefyapps.sreader.features.splashscreen.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sirteefyapps.sreader.ui.theme.SplashBg

@Composable
fun PagerScreen(svgImage: ImageVector, boldText: String, description: String) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    Surface(
        color = SplashBg,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .windowInsetsPadding(WindowInsets.safeDrawing)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(
                modifier = Modifier.height(20.dp)
            )
            Surface(
                modifier = Modifier.height(screenHeight.dp * 0.5f), color = SplashBg
            ) {
                Image(
                    imageVector = svgImage,
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxSize(),
                )
            }
            Spacer(
                modifier = Modifier.height(20.dp)
            )
            Text(
                text = boldText,
                style = MaterialTheme.typography.headlineSmall,
                color = Color.White,
                modifier = Modifier
                    .padding(5.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = description,
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontSize = 12.sp,
                    lineHeight = 15.sp

                ),
                color = Color.Gray,
                modifier = Modifier
                    .padding(
                        horizontal = 40.dp,
                    )
                    .align(Alignment.CenterHorizontally)
            )

        }
    }
}
