package com.luminous.digitalbusinesscard.Profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.luminous.digitalbusinesscard.ui.theme.LocalSpacing

@Composable
fun StatChip(
        label: String,
        value: String,
        modifier: Modifier = Modifier
) {
        val spacing = LocalSpacing.current

        Surface(
                modifier = modifier,
                shape = MaterialTheme.shapes.large,
                tonalElevation = 1.dp
        ) {
                // HStack
                Column(
                        modifier = Modifier.padding(horizontal = spacing.medium, vertical = spacing.small),
                        horizontalAlignment = Alignment.CenterHorizontally
                ) {
                               

                }
        }
}