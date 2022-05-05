package com.ekinsdrow.common.core.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Screen(
    content: @Composable () -> Unit
) {
    Surface(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Box(modifier = Modifier.padding(12.dp)) {
            content()
        }
    }
}