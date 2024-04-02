package com.example.androidproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidproject.ui.theme.AndroidProjectTheme

class TopAppBar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                TopApp()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopApp(){
    val context = LocalContext.current.applicationContext
    androidx.compose.material3.TopAppBar(title = {Text(text = "Emobilis")},
    navigationIcon = {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu", tint = Color.Black)
        }
    },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Magenta,
            titleContentColor = Color.Black,
            navigationIconContentColor = Color.Black,
        ),
        actions = {
            IconButton(onClick = {Toast.makeText(context,"You have clicked the profile",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Person, contentDescription = "My Profile", tint = Color.Black)
            }
            IconButton(onClick = {Toast.makeText(context, "You have clicked the search icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search", tint = Color.Cyan)
            }
            IconButton(onClick = {Toast.makeText(context, "you have clicked on the Home",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "Home", tint = Color.Green)
            }
        }
        )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TopAppPreview(){
    TopApp()
}