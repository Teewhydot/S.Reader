import android.graphics.Paint.Align
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
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
import com.sirteefyapps.sreader.ui.theme.SplashBg

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
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Login",
                style = MaterialTheme.typography.headlineSmall.copy(
                    color = Color.White
                )
            )
            Spacer(
                modifier = Modifier.height(20.dp)
            )
            Surface() {
                        TextField(
                            value = "",
                            onValueChange = {},
                            label = { Text("Email") }
                        )
            }
            Spacer(
                modifier = Modifier.height(10.dp)
            )
            Surface() {
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Password") }
                )
            }
            Spacer(
                modifier = Modifier.height(20.dp)
            )
        }
    }
}
