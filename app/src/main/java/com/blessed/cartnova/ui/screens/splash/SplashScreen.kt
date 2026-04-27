package com.blessed.cartnova.ui.screens.splash
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.blessed.cartnova.R
import com.blessed.cartnova.navigation.ROUTE_ONBOARDINGSCREEN1
import com.blessed.cartnova.ui.theme.newblue
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    //Navigation

    val x = rememberCoroutineScope()
    x.launch {

        delay(2000)
        navController.navigate(ROUTE_ONBOARDINGSCREEN1)

    }

    //End Navigation

    Column(
        modifier = Modifier.fillMaxSize()
            .background(newblue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(R.drawable.img_4),
            contentDescription = "img",
            modifier = Modifier.size(200.dp)

        )













    }


}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())

}