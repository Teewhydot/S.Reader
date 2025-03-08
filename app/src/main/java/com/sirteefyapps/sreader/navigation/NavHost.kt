package com.sirteefyapps.sreader.navigation

import LoginScreen
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
        startDestination = SReaderScreens.Splash
    ) {
        composable<SReaderScreens.Splash> {
            SReaderSplash()
        }
        composable<SReaderScreens.Intro> {
            IntroScreen()
        }
        composable<SReaderScreens.Login> {
            LoginScreen()
        }
        composable<SReaderScreens.Register> {
            IntroScreen()
        }
    }
}


object SReaderScreens {

    @Serializable
    object  Intro

    @Serializable
    object Splash

    @Serializable
    object Login

    @Serializable
    object Home

    @Serializable
    object Register

    @Serializable
    object Profile

    @Serializable
    object Settings


    @Serializable
    object BookDetails
}
