package com.sirteefyapps.sreader.features.home_screen.presentation.component

import Star_icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sirteefyapps.sreader.R
import com.sirteefyapps.sreader.ui.theme.SplashBGTint
import com.sirteefyapps.sreader.ui.theme.SplashBg
import com.sirteefyapps.sreader.ui.theme.buttonTextStyle
import com.sirteefyapps.sreader.ui.theme.headerTextStyle

@Preview
@Composable
 fun BookDetailsScreen() {
    Surface(
        color = SplashBg,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(){
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                color = SplashBGTint,
                shape = RoundedCornerShape(
                    bottomEnd = 20.dp,
                    bottomStart = 20.dp
                )
            ){
                Box(){
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White,
                        modifier = Modifier.clickable {
                        }.padding(10.dp)
                    )
                }
                Row(
                    modifier = Modifier.fillMaxSize()
                        .padding(10.dp).offset(x = 20.dp, y = 50.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rdpd2by3),
                        contentDescription = "Book",
                        modifier = Modifier,
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(
                        modifier = Modifier.width(20.dp)
                    )
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Text(
                            modifier = Modifier.padding(bottom = 10.dp),
                            text = "Rich dad poor dad",
                            style = headerTextStyle.copy(
                                fontSize = 14.sp
                            ),
                        )
                        Text(
                            text = "hjdsjsdhjfe ewqkbfq f eqrkiweriu rewiweluifds treqt eyt tye trw qer ty hg dsas qett hr htr j wer tqwt gr g wgr",
                            modifier = Modifier.padding(bottom = 10.dp, end = 10.dp),
                            style = buttonTextStyle.copy(
                                color = Color.Gray,
                                fontSize = 10.sp,
                                lineHeight = 12.sp
                            )
                        )
                        Spacer(
                            modifier = Modifier.height(10.dp)
                        )
                       Row(
                           modifier = Modifier.fillMaxSize()
                       ) {
                           for (i in 1..5) {
                               Image(
                                   imageVector = Star_icon,
                                   contentDescription = "Star",
                                   modifier = Modifier
                                       .height(10.dp)
                                       .width(10.dp)
                               )

                           }
                           Spacer(
                               modifier = Modifier.width(5.dp)
                           )
                           Text(
                               text = "5.0",
                               style = buttonTextStyle.copy(
                                   color = Color.Gray,
                                   fontSize = 10.sp
                               )
                           )
                       }
                    }
                }

            }
           Box(
               modifier = Modifier.offset(x = 0.dp, y = 250.dp).padding(20.dp)
           ){
              AuthorProfileCard()
               Column (
                   modifier = Modifier.offset(y = 100.dp)
               ){
                   Text(
                       text = "About the book",
                       style = headerTextStyle,
                       modifier = Modifier.padding(10.dp),
                   )
                   Text(
                       text = "'The Psychology of Money' is an essential read for anyone interested in being better with money. Fast-paced and engaging, this book will help you refine your thoughts towards money. You can finish this book in a week, unlike other books that are too lengthy.\n" +
                               "\n" +
                               "The most important emotions in relation to money are fear, guilt, shame and envy. It's worth spending some effort to become aware of the emotions that are especially tied to money for you because, without awareness, they will tend to override rational thinking and drive your actions.",
                       style = buttonTextStyle,
                       modifier = Modifier.padding(10.dp),
                   )
               }
           }

        }

    }
}
