package com.atom.features.splash

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.atom.core.R
import com.atom.features.navigation.model.BaseRoute
import kotlinx.coroutines.delay

@Composable
fun AnimatedSplashScreen(navController: NavHostController) {
    var startAnimation by remember { mutableStateOf(false) }

    var isVisible by remember { mutableStateOf(true) }
    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 3000
        ), label = ""
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(3000)
        navController.popBackStack()
        isVisible = false
        //    navController.clearBackStack(Route.Splash)
    }
    if (isVisible) {
        Splash(alpha = alphaAnim.value)
    } else {

        navController.navigate(BaseRoute.Home)

    }
}

@Composable
fun Splash(alpha: Float) {
    Box(
        modifier = Modifier
            .background(if (isSystemInDarkTheme()) Color.White else Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(

            painter = painterResource(id = R.drawable.logo_pos25),
            contentDescription = "Splash screen logo",
            modifier = Modifier
                .align(Alignment.Center)
                .alpha(alpha = alpha)
                .size(250.dp)
        )
    }
}