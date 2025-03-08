package com.sirteefyapps.sreader.features.home_screen.presentation.activity

import Home_design
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sirteefyapps.sreader.R
import com.sirteefyapps.sreader.features.home_screen.presentation.component.BookCard
import com.sirteefyapps.sreader.ui.theme.SplashBg
import com.sirteefyapps.sreader.ui.theme.headerTextStyle

@Preview
@Composable
fun HomeScreen(){
  Surface() {
      Surface(
          modifier = Modifier.fillMaxSize(),
          color = SplashBg,
      ) {
          Box(
              modifier = Modifier.fillMaxSize(),
          ){
              Image(
                  imageVector = Home_design,
                  contentDescription = "Home Design",
                  modifier = Modifier.align(Alignment.TopEnd),
              )
          }
      }
     Column(
         modifier = Modifier.fillMaxSize().padding(10.dp).verticalScroll(rememberScrollState())
     ) {
         Text(
             text = "Book of the Week",
             style = headerTextStyle,
             modifier = Modifier.align(Alignment.CenterHorizontally).padding(10.dp)
         )
         Spacer(
                modifier = Modifier.height(20.dp)
         )
         BookCard(
            description = "The psychology of money is the study of our behavior with money. Success with money isn't about knowledge, IQ or how good you are at math. It's about behavior, and everyone is prone to certain behaviors over others.",
             heading = "The Psychology of Money",
                image = R.drawable.psychology_of_money3by5,
             onClickGrabNow = {}
         )
     }
  }
}
