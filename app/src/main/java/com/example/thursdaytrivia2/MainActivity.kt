package com.example.thursdaytrivia2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults

import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thursdaytrivia2.ui.theme.ThursdayTrivia2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThursdayTrivia2Theme {
                HomeScreen()
            }
        }
    }
}

@Preview
@Composable
fun HomeScreen(){
    LandingPage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.TopCenter)
    )
}

@Composable
fun LandingPage(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter= painterResource(R.drawable.ttimg),
            contentDescription="freepik image",
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text("Score",
            fontSize = 30.sp
        )
        Text("0 / 4",
            fontSize = 50.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text("You chose",
                    fontSize = 16.sp
                )
                Text("Rock",
                    fontSize = 32.sp
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Android chose",
                    fontSize = 16.sp
                )
                Text("Paper",
                    fontSize = 32.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
                shape = RoundedCornerShape(25),
                modifier = Modifier.height(90.dp).width(90.dp),
            ) {
                Text( text = "Rock" ,
                    color = Color.White,
                )
            }

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
                shape = RoundedCornerShape(25),
                modifier = Modifier.height(90.dp).width(90.dp),
            ) {
                Text( text = "Paper" ,
                    color = Color.White,
                )
            }

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
                shape = RoundedCornerShape(25),
                modifier = Modifier.height(90.dp).width(100.dp),
            ) {
                Text( text = "Scissors" ,
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))
        Text("#JetpackCompose",
            fontFamily = FontFamily.SansSerif,
            fontSize = 20.sp
        )
    }
}
