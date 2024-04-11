package com.atom.features.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.atom.features.home.HomeScreen
import com.atom.features.items.ItemsScreen
import com.atom.features.navigation.model.BaseRoute
import com.atom.features.navigation.model.HomeRoute
import com.atom.features.splash.AnimatedSplashScreen


@Composable
fun SetUpNavHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = BaseRoute.Splash
    ) {
        composable(route = BaseRoute.Splash) {
            AnimatedSplashScreen(navController = navController)
        }

        composable(route = BaseRoute.Home) {
            HomeScreen(
                navController = navController,
                navigateToPayment = {
                    navController.navigate(HomeRoute.payment)
                },
                navigateToItems = {
                    navController.navigate(HomeRoute.items)
                },
                navigateToReceipt = {
                    navController.navigate(HomeRoute.receipt)
                },
                navigateToSettings = {
                    navController.navigate(HomeRoute.settings)
                }
            )
        }

        composable(route = HomeRoute.items) {
            ItemsScreen()
        }
    }

}