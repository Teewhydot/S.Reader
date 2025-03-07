package com.sirteefyapps.sreader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.sirteefyapps.sreader.navigation.SReaderNavigation
import com.sirteefyapps.sreader.ui.theme.SReaderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SReaderTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SReaderApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun SReaderApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    SReaderNavigation(
        navController = navController
    )
}
