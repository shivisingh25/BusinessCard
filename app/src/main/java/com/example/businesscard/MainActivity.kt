package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardTop(name = "Shivangi Singh",
                                title = "Android Developer")
                    BusinessCardBottom(contact = "+919939263850",
                        socialMediaId = "@AndroidDev",
                        emailId = "shivangisingh0306@gmail.com")
                }
            }
        }
    }
}

@Composable
fun BusinessCardTop(name: String, title: String, modifier: Modifier = Modifier) {
   Box(modifier = Modifier
       .background(color = Color(0xFFd2e8d4) ),
       contentAlignment = Alignment.Center){
       val image = painterResource(id = R.drawable.android_logo)
    Column(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .height(100.dp)
                .width(100.dp),
            contentScale = ContentScale.Crop

        )
        Text(
            text = name,
            fontSize = 25.sp,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006d3b)
        )
    }
}
}

@Composable
fun BusinessCardBottom(contact: String, socialMediaId: String, emailId: String,modifier: Modifier = Modifier){
    var image1 = painterResource(id = R.drawable.call)
    var image2 = painterResource(id = R.drawable.socialmedia)
    var image3 = painterResource(id = R.drawable.email)
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier

    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 4.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = image1,
                contentDescription = contact,
                modifier = modifier
                    .height(20.dp)
                    .width(20.dp),
                contentScale = ContentScale.Crop,


            )
            Text(
                text = contact,
                modifier = modifier.padding(start = 8.dp, end = 8.dp)

            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 4.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = image2,
                contentDescription = null,
                modifier = modifier
                    .height(20.dp)
                    .width(20.dp),
                contentScale = ContentScale.Crop,

            )
            Text(
                text = socialMediaId,
                modifier = modifier.padding(start = 8.dp,end = 8.dp)
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 4.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){
            Image(
                painter = image3,
                contentDescription = null,
                modifier = modifier
                    .height(20.dp)
                    .width(20.dp),
                contentScale = ContentScale.Crop,

            )
            Text(
                text = emailId,
                modifier = modifier.padding(start = 8.dp, end = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardTop(name = "Shivangi Singh",
            title = "Android Developer")
        BusinessCardBottom(contact = "+919939263850",
            socialMediaId = "@AndroidDev",
            emailId = "shivangisingh0306@gmail.com")

    }
}