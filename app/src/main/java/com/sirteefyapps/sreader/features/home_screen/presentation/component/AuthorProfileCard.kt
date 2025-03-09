package com.sirteefyapps.sreader.features.home_screen.presentation.component

import Star_icon
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sirteefyapps.sreader.R
import com.sirteefyapps.sreader.ui.theme.Purple40
import com.sirteefyapps.sreader.ui.theme.buttonTextStyle
import com.sirteefyapps.sreader.ui.theme.headerTextStyle

@Preview
@Composable
fun AuthorProfileCard() {
    Surface(
        modifier = Modifier.height(95.dp).fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        color = Purple40
    ) {
        Row(
            modifier = Modifier.fillMaxSize().padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
        Row(){
            Image(
                painter = painterResource(R.drawable.author_picture),
                contentDescription = "Author Image",
            )
            Spacer(
                modifier = Modifier.width(10.dp)
            )
            Column{
                Text(
                    text = "Author Name",
                    style = headerTextStyle
                )
                Text(
                    text = "Author achievement/awards",
                    style = buttonTextStyle.copy(
                        color = Color.Gray
                    )
                )
            }
        }
        Image(
            imageVector = Star_icon,
            contentDescription = "Star Icon",
        )
        }
    }
}
