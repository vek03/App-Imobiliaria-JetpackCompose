package com.example.appmobiliaria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.appmobiliaria.navigation.NavManager
import com.example.appmobiliaria.ui.theme.AppImobiliariaTheme
import com.example.appmobiliaria.views.AnuncieScreen
import com.example.appmobiliaria.views.ComprarScreen
import com.example.appmobiliaria.views.HomeScreen
import com.example.appmobiliaria.views.NovoScreen
import com.example.appmobiliaria.views.SobreScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppImobiliariaTheme {
                NavManager()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun NovoPreview(){
    val navController = rememberNavController()
    NovoScreen(navController = navController)
}


@Preview(showBackground = true)
@Composable
fun ComprarPreview(){
    val navController = rememberNavController()
    ComprarScreen(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun SobrePreview(){
    val navController = rememberNavController()
    SobreScreen(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun AnunciePreview(){
    val navController = rememberNavController()
    AnuncieScreen(navController = navController)
}

