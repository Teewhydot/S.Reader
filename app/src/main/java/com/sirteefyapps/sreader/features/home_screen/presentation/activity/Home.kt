package com.sirteefyapps.sreader.features.home_screen.presentation.activity

import Home_design
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sirteefyapps.sreader.R
import com.sirteefyapps.sreader.features.home_screen.presentation.component.BookCard
import com.sirteefyapps.sreader.features.home_screen.presentation.component.PopularBooksCard
import com.sirteefyapps.sreader.ui.theme.SplashBg
import com.sirteefyapps.sreader.ui.theme.headerTextStyle

@Preview
@Composable
fun HomeScreen() {
    Surface() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = SplashBg,
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
            ) {
                Image(
                    imageVector = Home_design,
                    contentDescription = "Home Design",
                    modifier = Modifier.align(Alignment.TopEnd),
                )
            }
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            item {
               Box(
                   modifier = Modifier.fillMaxSize(),
                   contentAlignment = Alignment.Center,
               ){
                   Text(
                       text = "Book of the Week",
                       style = headerTextStyle,
                       modifier = Modifier
                           .padding(10.dp),

                       )
               }
                Spacer(
                    modifier = Modifier.height(20.dp)
                )
                BookCard(
                    description = "The psychology of money is the study of our behavior with money. Success with money isn't about knowledge, IQ or how good you are at math. It's about behavior, and everyone is prone to certain behaviors over others.",
                    heading = "The Psychology of Money",
                    image = R.drawable.psychology_of_money3by5,
                    onClickGrabNow = {}
                )
                Spacer(
                    modifier = Modifier.height(50.dp)
                )
                Text(
                    text = "Recommended for you",
                    style = headerTextStyle,
                )
                Spacer(
                    modifier = Modifier.height(20.dp)
                )
                LazyRow {
                    items(5) {
                        Box {
                            Image(
                                painter = painterResource(R.drawable.rec1),
                                contentDescription = "Home Design",
                                contentScale = ContentScale.Fit
                            )
                        }
                    }
                }
                Spacer(
                    modifier = Modifier.height(75.dp)
                )
                Text(
                    text = "Popular Books",
                    style = headerTextStyle,
                )
                Spacer(
                    modifier = Modifier.height(20.dp)
                )
            }
            items(5) {
                PopularBooksCard()
            }
        }
    }
}
