package com.sirteefyapps.sreader.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sirteefyapps.sreader.features.splashscreen.presentation.activity.IntroScreen
import com.sirteefyapps.sreader.features.splashscreen.presentation.activity.SReaderSplash
import kotlinx.serialization.Serializable

@Composable
fun SReaderNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = SReaderScreens.SplashScreen
    ) {
        composable<SReaderScreens.SplashScreen> {
            SReaderSplash()
        }
        composable<SReaderScreens.IntroScreen> {
            IntroScreen()
        }
    }
}


object SReaderScreens {

    @Serializable
    object  IntroScreen

    @Serializable
    object SplashScreen

    @Serializable
    object LoginScreen

    @Serializable
    object HomeScreen

    @Serializable
    object RegisterScreen

    @Serializable
    object ProfileScreen

    @Serializable
    object SettingsScreen


    @Serializable
    object BookDetailsScreen
}
