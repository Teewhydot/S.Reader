package com.sirteefyapps.sreader.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import kotlinx.serialization.Serializable

@Composable
fun SReaderNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = SReaderScreens.SplashScreen
    ) { }
}


object SReaderScreens {
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
