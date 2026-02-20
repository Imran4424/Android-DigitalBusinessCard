package com.luminous.digitalbusinesscard.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(
        navController: NavHostController,
        isDark: Boolean,
        onDarkChange: (Boolean) -> Unit
) {
        NavHost(
                navController = navController,
                startDestination = Routes.Profile
        ) {
                composable(Routes.Profile) {

                }

                composable(Routes.Settings) {

                }
        }
}