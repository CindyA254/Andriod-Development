package com.example.androidproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidproject.ui.theme.AndroidProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White),
                    color = MaterialTheme.colorScheme.background)
                {
                    Column (modifier = Modifier.border(width = 2.dp, color = Color.White, shape = RoundedCornerShape(20.dp))){
//                        HelloCustomer("George")
//                        WelcomeBack()
                        TextComponent(value = "Kings Mabati Company",
                            size= 22.sp,
                            Color.Blue,
                            FontFamily.Monospace,
                            FontWeight.Bold,
                            TextAlign.Center
                       )
                        TextComponent(value = "Register Here", size = 18.sp,
                            Color.Cyan,
                            FontFamily.SansSerif,
                            FontWeight.SemiBold,
                            TextAlign.Left
                        )
                        Spacer(modifier = Modifier.height(25.dp))
                        TextFieldComponent("Enter your name")
                        Spacer(modifier = Modifier.height(25.dp))
                        TextFieldComponent("Enter your Password")
                        Spacer(modifier = Modifier.height(30.dp))
                        CheckboxComponent(value = "I confirm that I have read all the Terms and conditions applied")
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
                            val intent = Intent(this@MainActivity,TopAppBar::class.java)
                                         startActivity(intent)
                                         },
                            colors = ButtonDefaults.buttonColors(Color.Magenta),
                            modifier = Modifier.fillMaxWidth()) {
                            Text(modifier = Modifier.padding(15.dp),
                                text = "LAZY LAYOUT",
                                color = Color.Black)

                            
                        }
                        }

                }
            }
        }
    }
}
@Composable
fun HelloCustomer(name:String){
    Text(text = "Good Morning $name")
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloCustomerPreview(name: String = "Philip") {
    Column {
//        HelloCustomer("George")
////        WelcomeBack()
        TextComponent(value = "Kings Mabati Company",
            18.sp,
            Color.Black,
            FontFamily.Monospace,
            FontWeight.Bold,
            TextAlign.Center
        )
        TextComponent(value = "Register Here",
            15.sp,
            Color.Magenta,
            FontFamily.SansSerif,
            FontWeight.SemiBold,
            TextAlign.Center
        )
//        TextFieldComponent()

        Spacer(modifier = Modifier.height(25.dp))
        TextFieldComponent("Enter your name")
        Spacer(modifier = Modifier.height(25.dp))
        TextFieldComponent("Enter your Email")
        Spacer(modifier = Modifier.height(25.dp))
        TextFieldComponent("Enter your Gender")
        Spacer(modifier = Modifier.height(25.dp))
        TextFieldComponent("Enter your Password")
        Spacer(modifier = Modifier.height(40.dp))
        CheckboxComponent(value = "I confirm that I have read and agreed to the Terms and conditions applied")
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
            Text(modifier = Modifier.padding(15.dp),
            text = "LOG IN HERE",
            color = Color.Black)

        }
        }


    }


//@Composable
//fun WelcomeBack(){
//    Text(text = "Welcome Back")
//}
//@Preview
//@Composable
//fun HelloCustomerPreview(){
//    HelloCustomer()
//}
@Composable
fun TextComponent(value:String,
                  size:TextUnit,
                  colorValue:Color,
                  fontFamilyValue: FontFamily,
                  fontWeightValue: FontWeight,
                  textAlignValue: TextAlign
                  ){

    Text(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight(align = Alignment.Top)
        .background(Color.Cyan)
        .border(width = 2.dp, color = Color.LightGray)
        .padding(18.dp),

        text = value,
        fontSize = 15.sp,
        color = Color.Black,
        fontFamily = fontFamilyValue,
        fontWeight = fontWeightValue,
        textAlign = textAlignValue
    )

}
@Composable
fun TextFieldsLabels(value: String){
    Text(text = value)
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComponent(mylabel:String) {
    var text by remember {
        mutableStateOf(value = "")
    }

    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = {
        newText -> text = newText
    },label={
            TextFieldsLabels(value = mylabel)
        }

    )
}
@Composable
fun CheckboxComponent(value: String){
    Row (modifier = Modifier
        .fillMaxWidth()
        .heightIn(56.dp)
        .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        val checkedState = remember {
            mutableStateOf(value = false)
        }
        Checkbox(checked = checkedState.value, onCheckedChange = {

        })
        TextFieldsLabels(value = value)
    }
}
//@Composable
//fun TextFieldComponent(mylabel: String){
//    var text = ""
//    TextField(modifier = Modifier.fillMaxWidth(),
//        value = text, onValueChange ={
//        newText -> text = newText
//    },
//   label = {TextFieldLabels(value = "my label")})
//}
//@Composable
//fun TextFieldLabels(value: String){
//    Text(text = value)
//}