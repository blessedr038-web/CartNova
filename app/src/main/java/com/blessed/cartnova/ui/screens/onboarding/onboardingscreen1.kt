package com.blessed.cartnova.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.blessed.cartnova.R
import com.blessed.cartnova.navigation.ROUTE_REGISTER
import com.blessed.cartnova.ui.theme.newblue

@Composable
fun onboardingscreen1(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {


        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "img",
            modifier = Modifier.size(300.dp)

        )

        Spacer(modifier = Modifier.height(20.dp) )


        Text(
            text = "Welcome to CartNova",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            color = newblue
        )

        Spacer(modifier = Modifier.height(20.dp) )

        Text(
            text = "E-commerce, or electronic commerce, is the buying and selling of goods, services, or funds over the internet, utilizing digital platforms for transactions",
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(30.dp) )

        Button(
            onClick = { navController.navigate(ROUTE_REGISTER)
                      },
            colors = ButtonDefaults.buttonColors(newblue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(200.dp)
        )
        {
            Text(text = "Get Started")

        }









        }

    }









@Preview(showBackground = true)
@Composable
fun onboardingscreen1Preview(){

    onboardingscreen1(rememberNavController())

}