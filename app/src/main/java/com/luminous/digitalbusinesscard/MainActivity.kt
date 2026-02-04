package com.luminous.digitalbusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                // onCreate is the first lifecycle callback when the Activity is created.
                // savedInstanceState contains previously saved UI state if the Activity is being recreated
                // (e.g., after rotation or process death). It can be null the first time.
                super.onCreate(savedInstanceState)

                // for immersive modern look
                // By default, it makes the status bar and gesture navigation bar transparent
                // To prevent your UI from being hidden under the status bar or navigation bar, you must use Window Insets to add the appropriate padding.
                enableEdgeToEdge()

                // Starts the Compose world for this Activity.
                // Everything inside is a Composable UI tree.
                setContent {
                        // AppRoot is Composable UI
                        // Start View of the Android App
                        AppRoot()
                }
        }
}