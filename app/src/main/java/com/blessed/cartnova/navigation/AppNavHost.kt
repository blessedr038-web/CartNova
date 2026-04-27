package com.blessed.cartnova.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.blessed.cartnova.ui.screens.about.aboutscreen
import com.blessed.cartnova.ui.screens.auth.loginscreen
import com.blessed.cartnova.ui.screens.auth.registerscreen
import com.blessed.cartnova.ui.screens.contact.contactscreen
import com.blessed.cartnova.ui.screens.home.homescreen
import com.blessed.cartnova.ui.screens.intent.IntentScreen
import com.blessed.cartnova.ui.screens.onboarding.onboardingscreen1
import com.blessed.cartnova.ui.screens.onboarding.onboardingscreen2
import com.blessed.cartnova.ui.screens.payment.paymentscreen
import com.blessed.cartnova.ui.screens.service.servicescreen
import com.blessed.cartnova.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUTE_HOME) {
            homescreen(navController)
        }

        composable(ROUTE_ABOUT) {
            aboutscreen(navController)
        }

        composable(ROUTE_LOGIN) {
            loginscreen(navController)
        }
        composable(ROUTE_REGISTER) {
            registerscreen(navController)
        }

        composable(ROUTE_CONTACT) {
            contactscreen(navController)
        }

        composable(ROUTE_ONBOARDINGSCREEN1) {
            onboardingscreen1(navController)
        }

        composable(ROUTE_ONBOARDINGSCREEN2) {
            onboardingscreen2(navController)
        }

        composable(ROUTE_PAYMENT) {
            paymentscreen(navController)
        }

        composable(ROUTE_SERVICE) {
            servicescreen(navController)
        }

        composable(ROUTE_INTENT) {
            IntentScreen(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
















    }
}