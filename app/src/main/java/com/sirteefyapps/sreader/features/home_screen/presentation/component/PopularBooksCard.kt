package com.sirteefyapps.sreader.features.home_screen.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sirteefyapps.sreader.R
import com.sirteefyapps.sreader.features.splashscreen.presentation.component.ButtonComposable
import com.sirteefyapps.sreader.ui.theme.ButtonColor
import com.sirteefyapps.sreader.ui.theme.SplashBGTint
import com.sirteefyapps.sreader.ui.theme.buttonTextStyle
import com.sirteefyapps.sreader.ui.theme.headerTextStyle

@Preview
@Composable
private fun PopularBooksCard() {
    Surface(
        modifier = Modifier
            .height(116.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        color = SplashBGTint
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row {
              Image(
                  painter = painterResource(R.drawable.rec2),
                  contentDescription = "Book Image",

                  )
              Spacer(
                  modifier = Modifier.width(10.dp)
              )
              Column(
                  modifier = Modifier.padding(10.dp)
              ) {
                  Text(
                      text = "Book Title",
                      style = headerTextStyle.copy(
                          fontSize = 14.sp
                      )
                  )
                  Text(
                      text = "Book Description",
                      style = buttonTextStyle.copy(
                          fontSize = 11.sp,
                          color = Color.Gray,
                      )
                  )
                  Text(
                      text = buildAnnotatedString {
                          withStyle(
                              style = ParagraphStyle(
                                  textIndent = TextIndent.None,
                              )
                          ) {
                              withStyle(
                                  SpanStyle(
                                      fontSize = 10.sp,
                                      color = ButtonColor,
                                      fontWeight = FontWeight.Bold
                                  )
                              ) {
                                  append("5.0")
                                  withStyle(
                                      SpanStyle(
                                          fontSize = 10.sp,
                                          color = ButtonColor,
                                          fontWeight = FontWeight.Normal,
                                      )
                                  ) {
                                      append(" |")
                                      withStyle(
                                          SpanStyle(
                                              fontSize = 10.sp,
                                              color = Color.White,
                                              fontWeight = FontWeight.Normal,
                                          )
                                      ) {
                                          append(" Based on 23k reviews")
                                      }
                                  }

                              }
                          }
                      }
                  )
                  Spacer(
                      modifier = Modifier.height(10.dp)
                  )
                  Text(
                      text = "\$45.00",
                      style = buttonTextStyle.copy(
                          fontSize = 12.sp,
                          color = Color.White,
                      )
                  )
              }

          }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End,
                modifier = Modifier.fillMaxSize()
            ) {
                ButtonComposable(
                    modifier = Modifier,
                    buttonColor = ButtonColor,
                    buttonText = "Grab Now",
                    onClick = {},
                    width = 90,
                    height = 30,
                    buttonStyle = buttonTextStyle.copy(
                        fontSize = 12.sp,
                    )
                )
                ButtonComposable(
                    buttonText = "Learn More",
                    onClick = {},
                    buttonColor = Color.Transparent,
                    modifier = Modifier,
                    width = 90,
                    height = 30,
                    buttonStyle = buttonTextStyle.copy(
                        fontSize = 12.sp,
                    )
                )
            }
        }
    }
}
