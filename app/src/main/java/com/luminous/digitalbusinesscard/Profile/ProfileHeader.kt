package com.luminous.digitalbusinesscard.Profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.luminous.digitalbusinesscard.ui.theme.LocalSpacing

@Composable
fun ProfileHeader(
        name: String,
        bio: String,
        modifier: Modifier = Modifier
) {
        val localSpacing = LocalSpacing.current

        Card(modifier = Modifier) {
                // VStack
                Row(
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(localSpacing.medium),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                        Surface(
                                modifier = Modifier
                                        .size(64.dp)
                                        .clip(CircleShape),
                                tonalElevation = 2.dp
                        ) {
                                Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                                imageVector = Icons.Default.Person,
                                                contentDescription = "Avatar"
                                        )
                                }
                        }

                        // Spacer in SwiftUI
                        Spacer(Modifier.width(localSpacing.medium))

                        Column(Modifier.weight(1f)) {


                        }
                }
        }

}