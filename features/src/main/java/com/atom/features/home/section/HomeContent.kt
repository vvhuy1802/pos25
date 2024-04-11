package com.atom.features.home.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.atom.core.model.CommonMenu
import com.atom.features.components.CommonMenuItem

@Composable
fun GridMenu(
    textSize: Int,
    cardSize: Int,
    iconSize: Int,
    cardPadding: Int,
    gridCells: Int,
    containerColor: Color,
    modifier: Modifier = Modifier,
    items: List<CommonMenu>,
    onItemClick: (CommonMenu) -> Unit
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(gridCells),
        modifier = modifier
            .background(color =  containerColor)
            .fillMaxSize(),
        contentPadding = PaddingValues(all = 8.dp),
    ) {
        items(items) { items ->
            CommonMenuItem(
                textSize = textSize,
                cardSize= cardSize,
                iconSize = iconSize,
                cardPadding = cardPadding,
                item = items,
                onClick = { onItemClick(items) }
            )
        }
    }
}