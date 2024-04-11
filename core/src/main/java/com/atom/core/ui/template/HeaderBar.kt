package com.atom.core.ui.template

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.atom.core.R

@Composable
fun HeaderBar(modifier: Modifier = Modifier) {
    Surface {
        Box(
            modifier = modifier
                .height(56.dp)
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_pos25),
                contentDescription = "Home header",
                modifier = Modifier
                    .size(96.dp, 40.dp)
                    .align(Alignment.Center))

        }
    }
}

@Composable
fun ColorHeaderBar(
    name: String,
    modifier: Modifier = Modifier,
    textColor: Color,
    colorContainer: Color) {
    Surface {
        Box(
            modifier = modifier
                .background(colorContainer)
                .height(56.dp)
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {

            Text(
                name,
                modifier = modifier
                    .align(Alignment.Center),
                fontSize = 16.sp,
                color = textColor
            )
        }
    }
}