package com.atom.core.ui.template

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.atom.core.ui.theme.Grey

@Composable
fun BottomHomeBar(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Grey)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

//            Image(
//                painter = painterResource(id = R.drawable.visa),
//                contentDescription = "Splash screen logo",
//                modifier = Modifier
//                    .size(25.dp, 8.dp)
//            )
//
//            Image(
//                painter = painterResource(id = R.drawable.master_card),
//                contentDescription = "Splash screen logo",
//                modifier = Modifier
//                    .size(21.dp, 12.dp)
//            )
//
//            Image(
//                painter = painterResource(id = R.drawable.napas),
//                contentDescription = "Splash screen logo",
//                modifier = Modifier
//                    .size(41.dp,12.dp)
//            )
//
//            Image(
//                painter = painterResource(id = R.drawable.jcb),
//                contentDescription = "Splash screen logo",
//                modifier = Modifier
//                    .size(19.dp, 12.dp)
//            )
        }
    }
}