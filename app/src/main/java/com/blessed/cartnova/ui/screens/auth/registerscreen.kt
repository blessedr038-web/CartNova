package com.blessed.cartnova.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.blessed.cartnova.R
import com.blessed.cartnova.navigation.ROUTE_LOGIN
import com.blessed.cartnova.ui.theme.newblue


@Composable
fun registerscreen(navController: NavController){

    Column(

        modifier = Modifier
            .fillMaxSize()
            .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Spacer(modifier = Modifier.height(30.dp) )

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "img",
            modifier = Modifier.size(150.dp)

        )
        Spacer(modifier = Modifier.height(30.dp) )




        Text(
            text ="Join us and start your journey today",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(30.dp) )

        //Variables

        var username by remember { mutableStateOf("") }
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            label = { Text(text = "Username") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newblue,
                focusedBorderColor = newblue,
                unfocusedLeadingIconColor = newblue


            )

        )
        Spacer(modifier = Modifier.height(20.dp) )

        var email by remember { mutableStateOf("") }
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            label = { Text(text = "Email address") },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newblue,
                focusedBorderColor = newblue,
                unfocusedLeadingIconColor = newblue


            )

        )
        Spacer(modifier = Modifier.height(20.dp) )

        var password by remember { mutableStateOf("") }
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            label = { Text(text = "Password") },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newblue,
                focusedBorderColor = newblue,
                unfocusedLeadingIconColor = newblue


            ),
            visualTransformation = PasswordVisualTransformation()


        )
        Spacer(modifier = Modifier.height(20.dp) )

        var confirmpassword by remember { mutableStateOf("") }
        OutlinedTextField(
            value = confirmpassword,
            onValueChange = { confirmpassword = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            label = { Text(text = "Confirm Password") },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newblue,
                focusedBorderColor = newblue,
                unfocusedLeadingIconColor = newblue


            ),
            visualTransformation = PasswordVisualTransformation()


        )
        Spacer(modifier = Modifier.height(20.dp) )


        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(newblue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(200.dp)
        ){
            Text(text = "Register Here")
        }

        Spacer(modifier = Modifier.height(5.dp) )

        TextButton(onClick = {navController.navigate(ROUTE_LOGIN)}) {
            Text(text = "Already have an account? Login")
        }




























    }


}

@Preview(showBackground = true)
@Composable
fun registerscreenPreview(){
    registerscreen(rememberNavController())

}