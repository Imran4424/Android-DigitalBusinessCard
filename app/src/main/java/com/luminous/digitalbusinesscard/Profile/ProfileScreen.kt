package com.luminous.digitalbusinesscard.Profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
                        ProfileHeader(
                                name = "Shah Md. Imran Hossain",
                                bio = "Senior Software Engineer",
                                modifier = Modifier.fillMaxSize()
                        )

                        // VStack
                        Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(localSpacing.medium)
                        ) {
                                StatChip("Posts", "128", Modifier.weight(1f))
                                StatChip("Followers", "2.4K", Modifier.weight(1f))
                                StatChip("Following", "310", Modifier.weight(1f))
                        }

                        Card(Modifier.fillMaxSize()) {
                                // HStack
                                Column(Modifier.padding(localSpacing.medium), verticalArrangement = Arrangement.spacedBy(localSpacing.small)) {
                                        Text("About", style = MaterialTheme.typography.titleSmall)
                                        Text(
                                                "This is a static profile section. In later phases you can connect it to ViewModel/data layer.",
                                                style = MaterialTheme.typography.bodyMedium
                                        )
                                }
                        }
                }
        }
}

