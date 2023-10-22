package com.febrian.navigationdrawercompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.febrian.navigationdrawercompose.ui.screens.HomeScreen
import com.febrian.navigationdrawercompose.ui.screens.ProfileScreen
import com.febrian.navigationdrawercompose.ui.screens.SettingScreen

@Composable
fun AppNavigation(
    navController: NavHostController = rememberNavController()
) {

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Profile.route) {
            ProfileScreen()
        }
        composable(Screen.Settings.route) {
            SettingScreen()
        }

    }
}