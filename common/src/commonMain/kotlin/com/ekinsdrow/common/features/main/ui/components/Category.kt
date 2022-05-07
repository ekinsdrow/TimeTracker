package com.ekinsdrow.common.features.main.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material.Icon
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.PlayArrow


@Composable
fun Categories() {
    LazyColumn(
    ) {
        items(100) {
            Category()
        }


    }
}


@Composable
fun Category() {
    Box(
        modifier = Modifier.clip(RoundedCornerShape(10.dp)).background(Color(0XFFF5F4F7))
            .fillMaxWidth()
    ) {
        Column(
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            CategoryHeader("Music")
            Spacer(modifier = Modifier.height(13.dp))
//            SubCategories()
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}

@Composable
private fun CategoryHeader(name: String) {
    Row(
        modifier = Modifier.padding(horizontal = 12.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(name)
        Text("30:30:30")
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun SubCategories() {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 8.dp)
    ) {
        items(8) {
            SubCategoryBox {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Guitar")
                    Row(
                        horizontalArrangement = Arrangement.End,
                    ) {
                        Icon(Icons.Rounded.PlayArrow, contentDescription = "Play")
                        Text("30:30:30")
                    }
                }
            }
        }

        item {
            SubCategoryBox {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Add")
                    Icon(Icons.Filled.Add, contentDescription = "Add")
                }
            }
        }
    }
}


@Composable
private fun SubCategoryBox(
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier.padding(horizontal = 4.dp, vertical = 5.dp)
            .clip(RoundedCornerShape(10.dp)).clickable {
                //TODO: click
            }.background(Color(0xFFFFFFFF))
            .fillMaxWidth().padding(horizontal = 8.dp, vertical = 10.dp)
    ) {
        content()
    }
}