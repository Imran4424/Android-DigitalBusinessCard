package com.luminous.digitalbusinesscard.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

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

        }
}