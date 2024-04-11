package com.atom.core.ui.template

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.atom.core.ui.theme.Red40
import com.atom.core.ui.theme.disableButton

@Composable
fun CustomMainButton(
    label : String,
    isEnable: Boolean,
    onClick: () -> Unit
) {
    val isEnabled by remember { mutableStateOf(isEnable) }
    Button(
        onClick = onClick,

        colors = ButtonColors(
            containerColor = Red40,
            contentColor = Color.White,
            disabledContainerColor = disableButton,
            disabledContentColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 14.dp, top = 16.dp, end = 14.dp, bottom = 16.dp),
        shape = RoundedCornerShape(8.dp),
        enabled = isEnabled,

        ){
        Text(
            text = label,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    label : String,
    buttonColors: Color,
    isEnable: Boolean,
    onClick: () -> Unit
) {
    val isEnabled by remember { mutableStateOf(isEnable) }
    Button(
        onClick = onClick,
        colors = ButtonColors(
            containerColor = buttonColors,
            contentColor = Color.White,
            disabledContainerColor = disableButton,
            disabledContentColor = Color.White
        ),
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(4.dp),
        enabled = isEnabled,

        ){
        Text(
            text = label,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
    }
}

