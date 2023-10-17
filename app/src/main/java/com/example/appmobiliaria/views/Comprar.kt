package com.example.appmobiliaria.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appmobiliaria.R
import com.example.appmobiliaria.components.BackButton
import com.example.appmobiliaria.components.ImgCard
import com.example.appmobiliaria.components.NavContent
import com.example.appmobiliaria.ui.theme.darkTheme
import com.example.appmobiliaria.ui.theme.glittergold

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComprarScreen(navController: NavController){
    Scaffold(
        containerColor = darkTheme,
        topBar = {
            TopAppBar(
                title = {
                    NavContent()
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = darkTheme
                ),
                navigationIcon = {
                    BackButton(){
                        navController.navigate("home")
                    }
                }
            )
        }
    ){
        ContentComprarScreen(navController)
    }
}

@Composable
fun ContentComprarScreen(navController: NavController){
    Column (
        Modifier.verticalScroll(rememberScrollState())
            .fillMaxSize()
            .background(darkTheme)
    ){
        Row (
            modifier = Modifier.fillMaxSize()
                .padding(top = 80.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            ImgCard(
                "Casa Pequena",
                "R$ 70.000,00",
                glittergold,
                painterResource(R.drawable.casa_moderna_pequena)
            )

            ImgCard(
                "Casa MOderna",
                "R$ 150.000,00",
                glittergold,
                painterResource(R.drawable.casa_moderna)
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun ComprarPreview(){
    val navController = rememberNavController()
    ComprarScreen(navController)
}