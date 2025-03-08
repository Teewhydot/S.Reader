package com.sirteefyapps.sreader.features.home_screen.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sirteefyapps.sreader.features.splashscreen.presentation.component.ButtonComposable
import com.sirteefyapps.sreader.ui.theme.ButtonColor
import com.sirteefyapps.sreader.ui.theme.Purple40
import com.sirteefyapps.sreader.ui.theme.PurpleGrey40
import com.sirteefyapps.sreader.ui.theme.buttonTextStyle
import com.sirteefyapps.sreader.ui.theme.headerTextStyle


@Composable
fun BookCard(
    image: Int, heading: String, description: String, onClickGrabNow: () -> Unit
) {
    Surface(
        modifier = Modifier
            .height(185.dp)
            .fillMaxWidth(),
        shadowElevation = 5.dp,
        color = Purple40,
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
            ) {
            Image(
                painter = painterResource(image),
                contentDescription = "Book Image",
            )
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                Text(
                    modifier = Modifier.padding(bottom = 10.dp),
                    text = heading,
                    style = headerTextStyle.copy(
                        fontSize = 14.sp
                    ),
                )
                Text(
                    text = description,
                    modifier = Modifier.padding(bottom = 10.dp),
                    style = buttonTextStyle.copy(
                        color = Color.Gray,
                        fontSize = 10.sp,
                        lineHeight = 12.sp
                    )
                )
                Row {
                    ButtonComposable(
                        buttonText = "Grab Now",
                        onClick = onClickGrabNow,
                        buttonColor = ButtonColor,
                        modifier = Modifier,
                        width = 90,
                        height = 30,
                        buttonStyle = buttonTextStyle.copy(
                            fontSize = 12.sp,
                        )
                    )
                    ButtonComposable(
                        buttonText = "Learn More",
                        onClick = onClickGrabNow,
                        buttonColor = Purple40,
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

}
