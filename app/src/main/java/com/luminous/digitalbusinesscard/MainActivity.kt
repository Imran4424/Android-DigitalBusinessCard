package com.luminous.digitalbusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.luminous.digitalbusinesscard.ui.theme.DigitalBusinessCardTheme

class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                // for immersive modern look
                // By default, it makes the status bar and gesture navigation bar transparent
                // To prevent your UI from being hidden under the status bar or navigation bar, you must use Window Insets to add the appropriate padding.
                enableEdgeToEdge()
                setContent {
                        DigitalBusinessCardTheme {
                                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                                        Greeting(
                                                name = "Android",
                                                modifier = Modifier.padding(innerPadding)
                                        )
                                }
                        }
                }
        }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
                text = "Hello $name!",
                modifier = modifier
        )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        DigitalBusinessCardTheme {
                Greeting("Android")
        }
}