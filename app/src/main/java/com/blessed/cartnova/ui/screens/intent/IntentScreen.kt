package com.blessed.cartnova.ui.screens.intent




import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.blessed.cartnova.R
import com.blessed.cartnova.ui.theme.newblue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){

    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,


    ) {

        val mContext= LocalContext.current



        //TopAppBar


        TopAppBar(
            title = { Text(text = "Services") },
            navigationIcon = {

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu,contentDescription = "menu")
                }

            },

            actions = {

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart,contentDescription = "")
                }

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications,contentDescription = "")
                }

            },

            colors = TopAppBarDefaults.topAppBarColors(

                containerColor = newblue,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White,
                titleContentColor = Color.White





            )



        )



        //End Of TopAppBar
        Spacer(modifier = Modifier.height(250.dp) )


        Button(
            onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

            },
            colors = ButtonDefaults.buttonColors(newblue),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.width(200.dp)
        ){
            Text(text = "Pay Via Mpesa")
        }
        Spacer(modifier = Modifier.width(30.dp) )
        Button(
            onClick = {
                val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0790458826".toUri()
                smsIntent.putExtra("sms_body","Hello Blessed,how was your day?")
                mContext.startActivity(smsIntent)

            },
            colors = ButtonDefaults.buttonColors(newblue),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.width(200.dp)
        ){
            Text(text = "Send Message")
        }
        Spacer(modifier = Modifier.width(30.dp) )

        Button(
            onClick = {

                val callIntent= Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0790458826".toUri()
                mContext.startActivity(callIntent)

            },
            colors = ButtonDefaults.buttonColors(newblue),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.width(200.dp)
        ){
            Text(text = "Call")
        }
        Spacer(modifier = Modifier.width(30.dp) )
        Button(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("blessedr038@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent)
            },
            colors = ButtonDefaults.buttonColors(newblue),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.width(200.dp)
        ){
            Text(text = "Email")
        }
        Spacer(modifier = Modifier.width(30.dp) )
        Button(
            onClick = {
                val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "https://github.com/blessedr038-web")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
            },
            colors = ButtonDefaults.buttonColors(newblue),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.width(200.dp)
        ){
            Text(text = "Share")
        }
        Spacer(modifier = Modifier.width(30.dp) )
        Button(
            onClick = {
                val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }
            },
            colors = ButtonDefaults.buttonColors(newblue),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.width(200.dp)
        ){
            Text(text = "Camera")
        }










    }


}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())

}