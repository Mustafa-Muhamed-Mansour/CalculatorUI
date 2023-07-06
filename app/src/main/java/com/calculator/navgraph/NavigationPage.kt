package com.calculator.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.calculator.calui.myCalculatorUI
import com.calculator.splash.mySplash

@Composable
fun navigationPage() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Splash Screen") {
        this.composable("Splash Screen") {
            mySplash(navController = navController)
        }
        this.composable("CalculateUI") {
            myCalculatorUI()
        }

    }
}