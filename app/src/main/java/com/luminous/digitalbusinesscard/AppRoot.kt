package com.luminous.digitalbusinesscard

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.rememberNavController
import com.luminous.digitalbusinesscard.Navigation.AppNavGraph
import com.luminous.digitalbusinesscard.ui.theme.AppTheme

@Composable
fun AppRoot() {
        var navController = rememberNavController()

        var isDark by remember {
                mutableStateOf(false)
        }

        AppTheme(darkTheme = isDark) {
                AppNavGraph(
                        navController = navController,
                        isDark = isDark,
                        onDarkChange = { isDark = it }
                )
        }
}