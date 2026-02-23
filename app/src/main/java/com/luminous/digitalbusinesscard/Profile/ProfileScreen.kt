package com.luminous.digitalbusinesscard.Profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.luminous.digitalbusinesscard.ui.theme.LocalSpacing

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
        onGoToSettings: () -> Unit
) {
        val localSpacing = LocalSpacing.current

        Scaffold(
                topBar = {
                        TopAppBar(
                                title = { Text("Profile") },
                                actions = {
                                        IconButton(onClick = onGoToSettings) {
                                                Icon(Icons.Default.Settings, contentDescription = "Settings")
                                        }

                                }
                        )
                }
        ) { paddingValues ->
                Column(
                        modifier = Modifier
                                .padding(paddingValues)
                                .padding(localSpacing.medium)
                                .fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(localSpacing.medium)
                ) {

                }
        }
}