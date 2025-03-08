import android.graphics.Paint.Align
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sirteefyapps.sreader.features.splashscreen.presentation.component.ButtonComposable
import com.sirteefyapps.sreader.ui.theme.ButtonColor
import com.sirteefyapps.sreader.ui.theme.SplashBg
import com.sirteefyapps.sreader.ui.theme.buttonTextStyle

@Preview
@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing),
        color = SplashBg
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(
                modifier = Modifier.height(50.dp)
            )
            Text(
                text = "Login",
                style = MaterialTheme.typography.headlineSmall.copy(
                    color = Color.White
                )
            )
            Spacer(
                modifier = Modifier.height(50.dp)
            )
            Surface(
                shape = RoundedCornerShape(10.dp)
            ) {
                        TextField(
                            value = "",
                            onValueChange = {},
                            label = { Text("Email") }
                        )
            }
            Spacer(
                modifier = Modifier.height(25.dp)
            )
            Surface(
                shape = RoundedCornerShape(10.dp)

            ) {
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Password") }
                )
            }
            Spacer(
                modifier = Modifier.height(50.dp)
            )
            ButtonComposable(
                buttonText = "Login",
                onClick = {},
                modifier = Modifier.align(Alignment.CenterHorizontally),
                buttonColor = ButtonColor
            )
            Spacer(
                modifier = Modifier.height(20.dp)
            )
            ElevatedButton(onClick = {},
                border = BorderStroke(
                    width = 1.dp,
                    color = Color.White
                ),
                colors = ButtonColors(
                containerColor = SplashBg,
                contentColor = Color.White,
                disabledContainerColor = SplashBg,
                disabledContentColor = SplashBg,
            )
            ) {
                Text(
                    text = "Go Back",
                    style = buttonTextStyle
                )
            }

        }
    }
}
