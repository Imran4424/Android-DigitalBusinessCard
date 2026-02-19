package com.luminous.digitalbusinesscard.ui.theme

// Imports Activity class (not used in this snippet as-is).
// Often used when we want to access the window (status bar, navigation bar) or set system bar colors.
import android.app.Activity
// Imports Android version info (SDK_INT, etc.).
// Typically used to check API level (e.g., Android 12+) before using features.
// Note: in current code we don't directly use Build, but it's commonly used with dynamic color checks.
import android.os.Build

// Imports a helper function that returns true if the device is currently in dark mode.
import androidx.compose.foundation.isSystemInDarkTheme
// Imports MaterialTheme, the main theming wrapper for Material 3 Compose.
import androidx.compose.material3.MaterialTheme
// Imports function to create a ColorScheme for dark theme using Material 3.
import androidx.compose.material3.darkColorScheme

// Imports dynamic dark color scheme (Material You).
// On Android 12+ it can pull colors from the user’s wallpaper/system theme.
import androidx.compose.material3.dynamicDarkColorScheme

// Imports dynamic light color scheme (Material You).
// On Android 12+ it can pull colors from the user’s wallpaper/system theme.
import androidx.compose.material3.dynamicLightColorScheme

// Imports function to create a ColorScheme for light theme.
import androidx.compose.material3.lightColorScheme
// Imports @Composable annotation needed for composable functions.
import androidx.compose.runtime.Composable
// Imports LocalContext, which provides the current Android Context inside Compose.
// Needed for dynamic color functions because they require a context.
import androidx.compose.ui.platform.LocalContext

// Creates a ColorScheme object for dark theme.
// "private" means only this file can access it.
// "val" means it can't be reassigned.
private val DarkColorScheme = darkColorScheme(
        primary = Purple80, // Primary color used heavily across the app (buttons, highlights, etc.) in dark theme.
        secondary = PurpleGrey80, // Secondary color used for accents and some UI elements.
        tertiary = Pink80 // Tertiary color used for smaller accents or special UI components.
)

// Creates a ColorScheme object for light theme.
private val LightColorScheme = lightColorScheme(
        primary = Purple40, // Primary color for light theme.
        secondary = PurpleGrey40, // Secondary color for light theme.
        tertiary = Pink40 // Tertiary color for light theme.

        /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

// Defines a composable function that applies your app theme to its children.
// We can call this at the top of your app and wrap all screens inside it.
@Composable
fun AppTheme(
        // Parameter: whether the app should use dark colors.
        // Default: follows the system setting automatically.
        darkTheme: Boolean = isSystemInDarkTheme(),
        // Parameter: whether to use Material You dynamic colors.
        // Default: true, meaning it tries to use dynamic colors first.
        // Dynamic color is available on Android 12+
        dynamicColor: Boolean = true,
        // Trailing Closure: the UI content that will be themed.
        content: @Composable () -> Unit
) {
        // Chooses which color scheme the app should use.
        val colorScheme = when {
                // If dynamicColor is enabled, try to use dynamic color schemes.
                dynamicColor -> {
                        // Get the current Context (needed by dynamic color APIs).
                        val context = LocalContext.current

                        if (darkTheme) dynamicDarkColorScheme(context)
                        else dynamicLightColorScheme(context)
                }
                // If dynamicColor is false, and darkTheme is true -> use your custom dark scheme.
                darkTheme -> DarkColorScheme
                else -> LightColorScheme
                // Otherwise -> use your custom light scheme.
        }

        // Applies Material 3 theming to everything inside.
        MaterialTheme(
                colorScheme = colorScheme,
                typography = Typography,
                content = content
        )
}