package com.atom.features.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.atom.core.R.drawable
import com.atom.core.model.CommonMenu
import com.atom.core.ui.template.BaseScreen
import com.atom.core.ui.template.HeaderBar
import com.atom.features.home.section.GridMenu


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController? = null,
    navigateToPayment: () -> Unit,
    navigateToItems: () -> Unit,
    navigateToReceipt: () -> Unit,
    navigateToSettings: () -> Unit,
) {
    Box {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(drawable.image_bg),
            contentDescription = "background_image",
            contentScale = ContentScale.FillBounds
        )
        BaseScreen(
            modifier = modifier,
            topBar = {
                HeaderBar(
                    modifier = Modifier.background(Color.Transparent),
                )
            },
            containerColor = Color.Transparent,
            content = {
                GridMenu(
                    textSize = 16,
                    cardSize = 144,
                    iconSize = 60,
                    cardPadding = 16,
                    gridCells = 2,
                    containerColor = Color.Transparent,
                    items = listOf(
                        CommonMenu(id = 1, title = "Payment", icon = drawable.icon_payment),
                        CommonMenu(id = 2, title = "Items", icon = drawable.icon_items),
                        CommonMenu(id = 3, title = "Receipt", icon = drawable.icon_receipt),
                        CommonMenu(id = 4, title = "Settings", icon = drawable.icon_setting),
                    )
                ) { items ->
                    when (items.id) {
                        1 -> navigateToPayment()
                        2 -> navigateToItems()
                        3 -> navigateToReceipt()
                        4 -> navigateToSettings()
                    }
                }

            },
        )
    }

}

@Preview
@Composable
fun ReHome() {
    HomeScreen(
        navigateToPayment = {},
        navigateToItems = {},
        navigateToReceipt = {},
        navigateToSettings = {}
    )

}