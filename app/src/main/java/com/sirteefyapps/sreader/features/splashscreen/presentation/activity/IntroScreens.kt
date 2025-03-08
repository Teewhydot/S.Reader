package com.sirteefyapps.sreader.features.splashscreen.presentation.activity

import Splash1
import Splash2
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.sirteefyapps.sreader.ui.theme.SplashBg

@OptIn(ExperimentalPagerApi::class)
@Preview
@Composable
fun IntroScreen() {

    val pagerState = rememberPagerState()

    Surface(color = SplashBg, modifier = Modifier.windowInsetsPadding(WindowInsets.safeDrawing)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween

            ) {
       Column {
           Row(
               horizontalArrangement = Arrangement.SpaceBetween,
               verticalAlignment = Alignment.CenterVertically,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(10.dp)
           ) {
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
           HorizontalPager(
               count = 3,
               state = pagerState,
               verticalAlignment = Alignment.CenterVertically,
               userScrollEnabled = true,
           ) {
               page ->
               when (page) {
                   0 ->{
                       PagerScreen(
                           boldText = "Only Books Can Help You",
                           description = "Books can help you increase your knowledge, and make you smarter",
                           svgImage = Splash1
                       )
                   }
                   1 -> {
                       PagerScreen(
                           boldText = "Learn Smartly",
                           description = "It’s 2022 and it’s time to learn every quickly and smartly. All books are storage in cloud and you can access all of them from your laptop or PC. ",
                           svgImage = Splash2
                       )
                   }
                   2 -> {
                       ThirdPagerScreen()
                   }
               }
           }
       }

            IndicatorComposable(
                activeIndex = pagerState.currentPage
            )
        }
    }
}

@Composable
fun ThirdPagerScreen(){
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
                    contentScale = ContentScale.FillBounds
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
                Box(){

                }
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


@Composable
fun IndicatorComposable(activeIndex: Int) {
    Row {
        for (i in 0..2) {
            Spacer(modifier = Modifier.width(10.dp).padding(10.dp))
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
