package com.example.appmobiliaria.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appmobiliaria.views.AnuncieScreen
import com.example.appmobiliaria.views.ComprarScreen
import com.example.appmobiliaria.views.HomeScreen
import com.example.appmobiliaria.views.NovoScreen
import com.example.appmobiliaria.views.SobreScreen

@Composable
fun NavManager(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home"){
        composable("home"){
            HomeScreen(navController)
        }

        composable("comprar"){
            ComprarScreen(navController)
        }

        composable("novo"){
            NovoScreen(navController)
        }

        composable("anuncie"){
            AnuncieScreen(navController)
        }

        composable("sobre"){
            SobreScreen(navController)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun HomePreview(){
    val navController = rememberNavController()
    HomeScreen(navController)
}