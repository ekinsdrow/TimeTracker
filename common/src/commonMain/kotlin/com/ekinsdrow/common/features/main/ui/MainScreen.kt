package com.ekinsdrow.common.features.main.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ekinsdrow.common.core.charts.RoundedChart
import com.ekinsdrow.common.core.ui.Screen

@Composable
fun MainScreen() {
    Screen() {
        Column() {
            Top()
            Spacer(
                modifier = Modifier.height(18.dp)
            )
            Statistic()
        }
    }
}

@Composable
private fun Top() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Time Tracker")
        IconButton(onClick = {}) { Icon(Icons.Filled.Settings, "Settings") }
    }
}

@Composable
private fun Statistic() {
    Box(
        modifier = Modifier.fillMaxWidth().height(100.dp)
            .clip(RoundedCornerShape(10.dp)).background(
                brush = Brush.horizontalGradient(
                    colors = listOf(Color(0xFF4F9AAA), Color(0xFFC0EFEF)),
                ),
            ).padding(12.dp)
    ) {
        RoundedChart()
    }
}