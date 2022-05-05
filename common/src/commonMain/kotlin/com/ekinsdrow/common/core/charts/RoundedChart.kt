package com.ekinsdrow.common.core.charts

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun RoundedChart() {
    Canvas(
        modifier = Modifier.height(100.dp)
    ) {
        drawCircle(
            color = Color.Green,
            radius = 100F,
            style = Stroke(
                width = 1F
            )
        )
    }
}