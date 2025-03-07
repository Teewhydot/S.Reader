package com.sirteefyapps.sreader.features.splashscreen.presentation.activity

import Logo
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.sirteefyapps.sreader.ui.theme.SplashBg

@Preview(showBackground = true)
@Composable
fun SReaderSplash() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = SplashBg
    ) {
      Column(
          verticalArrangement = Arrangement.Center,
          horizontalAlignment = Alignment.CenterHorizontally,
      ) {
          Image(
              imageVector = Logo,
              contentDescription = null,
          )
          Text(
              text = "SReader",
              style = MaterialTheme.typography.headlineSmall.copy(
                  color = Color.White
              )
          )
      }
    }
}
