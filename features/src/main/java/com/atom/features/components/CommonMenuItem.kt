package com.atom.features.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.atom.core.model.CommonMenu

@Composable
fun CommonMenuItem(
    textSize: Int,
    cardSize: Int,
    iconSize: Int,
    cardPadding: Int,
    item: CommonMenu,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(cardPadding.dp)
            .clickable { onClick() }
            .shadow(4.dp, RoundedCornerShape(8.dp))
            .size(cardSize.dp, cardSize.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(item.icon),
                contentDescription = item.title,
                modifier = Modifier
                    .background(Color.White)
                    .size(iconSize.dp, iconSize.dp)
                    .padding(8.dp)
            )
            Text(
                text = item.title,
                modifier = Modifier.padding(4.dp),
                fontSize = textSize.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
