package com.luminous.digitalbusinesscard

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.rememberNavController
import com.luminous.digitalbusinesscard.Navigation.AppNavGraph
import com.luminous.digitalbusinesscard.ui.theme.AppTheme

// Top-level composable for the whole app.
@Composable
fun AppRoot() {
        // Creates a NavController and "remembers" it across recompositions.
        // If you DIDN'T use rememberNavController(), navigation would reset whenever AppRoot recomposes.
        val navController = rememberNavController()

        // App-level UI state: whether dark theme is enabled.
        // - remember { ... } keeps the state across recompositions.
        // - mutableStateOf(false) starts as false (light mode).
        // - "by" + getValue/setValue lets you read/write like a normal variable:
        var isDark by remember {
                mutableStateOf(false)
        }

        // Applies your theme to everything inside this block.
        // When isDark changes, AppTheme recomposes and switches color scheme accordingly.
        AppTheme(darkTheme = isDark) {
                // Builds the navigation graph (NavHost) using the same navController.
                AppNavGraph(
                        navController = navController,
                        // - isDark: current theme value (screens can display it e.g. switch position)
                        isDark = isDark,
                        //   When a screen calls onDarkChange(true), it sets isDark = true,
                        //   which triggers recomposition and updates the theme instantly.
                        onDarkChange = { isDark = it }
                )
        }
}