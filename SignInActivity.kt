package com.example.androidproject

import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidproject.ui.theme.AndroidProjectTheme

class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (modifier = Modifier.border(width = 2.dp, color = Color.White, shape = RoundedCornerShape(20.dp)))
                    {
//                        HelloCustomer("George")
//                        WelcomeBack()
//                        TextComponent(value = "Kings Mabati Company",
//                            size= 22.sp,
//                            Color.Blue,
//                            FontFamily.Monospace,
//                            FontWeight.Bold,
//                            TextAlign.Center
//                        )
//                        TextComponent(value = "Register Here", size = 18.sp,
//                            Color.Cyan,
//                            FontFamily.SansSerif,
//                            FontWeight.SemiBold,
//                            TextAlign.Left
//                        )
                        ImageComponent()
//                        Spacer(modifier = Modifier.height(25.dp))
//                        TextFieldComponent("Enter your name")
//                        Spacer(modifier = Modifier.height(25.dp))
                        TextFieldComponent("Enter your Email")
                        Spacer(modifier = Modifier.height(25.dp))
                        TextFieldComponent("Enter your Password")
                        Spacer(modifier = Modifier.height(30.dp))
//                        CheckboxComponent(value = "I confirm that I have read all the Terms and conditions applied")
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                        ) {
                            Text(modifier = Modifier.padding(2.dp),
                                text = "REGISTER HERE")
                        }
                        Spacer(modifier = Modifier.height(40.dp))
                        Button(onClick = {
                                 val intent = Intent(this@SignInActivity,MainActivity::class.java)
                                            startActivity(intent)
                                         },
                            colors = ButtonDefaults.buttonColors(Color.Magenta),
                            modifier = Modifier.fillMaxWidth()) {
                            Text(modifier = Modifier.padding(10.dp),
                                text = "SIGN IN",
                                color = Color.Black)


                        }
                    }

                }
            }
        }
    }
}
@Preview
@Composable
fun SignInPreview(){
    Column {
//        HelloCustomer("George")
////        WelcomeBack()
//        TextComponent(value = "Welcome Back",
//            18.sp,
//            Color.Black,
//            FontFamily.Monospace,
//            FontWeight.Bold,
//            TextAlign.Center
//        )
//        TextComponent(value = "Sign In Here",
//            15.sp,
//            Color.Magenta,
//            FontFamily.SansSerif,
//            FontWeight.SemiBold,
//            TextAlign.Center
//        )
//        TextFieldComponent()
            ImageComponent()
//        Spacer(modifier = Modifier.height(25.dp))
//        TextFieldComponent("Enter your name")
        Spacer(modifier = Modifier.height(25.dp))
        TextFieldComponent("Enter your Email")
//        Spacer(modifier = Modifier.height(25.dp))
//        TextFieldComponent("Enter your Gender")
        Spacer(modifier = Modifier.height(25.dp))
        TextFieldComponent("Enter your Password")
        Spacer(modifier = Modifier.height(40.dp))
//        CheckboxComponent(value = "I confirm that I have read and agreed to the Terms and conditions applied")
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(modifier = Modifier.padding(2.dp),
                text = "REGISTER HERE")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier = Modifier.fillMaxWidth()) {
            Text(modifier = Modifier.padding(10.dp),
                text = "SIGN IN",
                color = Color.Black)

        }
    }
}
@Composable
fun ImageComponent(){
    Image(modifier = Modifier.wrapContentHeight()
        .fillMaxWidth()
        .height(60.dp),
//        .background(color = Color.Black)
        painter = painterResource(id = R.drawable.logo),
        contentDescription ="Our logo" )
}