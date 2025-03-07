package com.sirteefyapps.sreader.features.auth.presentation.activity

import Splash1
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.safeGestures
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sirteefyapps.sreader.ui.theme.SplashBg

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LoginScreen(){
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = SplashBg
    ) {
        Column(
            modifier = Modifier.windowInsetsPadding(WindowInsets.safeDrawing).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(10.dp)
            ){
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    tint = Color.White
                )
                Text(
                    text = "Skip",
                    color = Color.White
                )
            }
            Spacer(
                modifier = Modifier.height(20.dp)
            )
           Surface(modifier = Modifier.width(450.dp).height(screenHeight.dp * 0.6f),        color = SplashBg
           ) {
               Image(
                   imageVector = Splash1,
                   contentDescription = null,
               )
           }
            Spacer(
                modifier = Modifier.height(20.dp)
            )
            Text(
                text = "Only books can help you",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.White,
                modifier = Modifier.padding(5.dp).align(Alignment.CenterHorizontally)
            )
            Spacer(
                modifier = Modifier.height(5.dp)
            )
            Text(
                text = "Books can help you to get knowledge, and develop yourself and your skills",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontSize = 12.sp
                ),
                color = Color.Gray,
                modifier = Modifier.padding(10.dp).align(Alignment.CenterHorizontally)
            )
            Spacer(
                modifier = Modifier.height(15.dp)
            )
            IndicatorComposable(
                activeIndex = 2
            )
        }
    }
}

@Composable
fun IndicatorComposable(activeIndex: Int) {
    Row {
        for (i in 0..2) {
            Spacer(modifier = Modifier.width(10.dp))
            IndicatorItemComposable(active = i == activeIndex)
        }
    }
}

@Composable
fun IndicatorItemComposable(active: Boolean) {
    Surface(
        modifier = Modifier.width(
            if (active) 30.dp else 10.dp
        ).height(10.dp),
        shape = RoundedCornerShape(10.dp),
        color = if (active) Color.Green else Color.Gray
    ) {

    }
}
