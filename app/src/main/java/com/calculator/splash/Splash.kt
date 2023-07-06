package com.calculator.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.calculator.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun mySplash(navController: NavController) {

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.calculator))
    val scope = rememberCoroutineScope()

    Box(modifier = Modifier.fillMaxSize()) {

        LottieAnimation(composition = composition)
        scope.launch {
            delay(5000)
            navController.navigate("CalculateUI")
        }
//        LaunchedEffect(Unit) {
//            delay(3000L)
//            navController.navigate("CalculateUI")
//        }
    }
}