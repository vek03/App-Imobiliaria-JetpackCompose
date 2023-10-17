package com.example.appmobiliaria.views

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appmobiliaria.components.NavContent
import com.example.appmobiliaria.ui.theme.RedDark
import com.example.appmobiliaria.ui.theme.Red
import com.example.appmobiliaria.ui.theme.darkTheme
import com.example.appmobiliaria.ui.theme.glittergold

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    NavContent()
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = darkTheme
                ),
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Menu",
                        tint = glittergold,
                        modifier = Modifier.size(40.dp)
                    )
                }
            )
        }
    ){
        ContenHomeScreen(navController)
    }
}

@Composable
fun ContenHomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(darkTheme)
        .padding(top = 80.dp)
        .verticalScroll(rememberScrollState()),

        //.align(CenterHorizontally),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextButton(
            onClick = { navController.navigate("comprar") },
            border = BorderStroke(0.dp, Color.Red),
            modifier = Modifier
                .border(1.dp, glittergold, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = darkTheme, // Cor de fundo do botão
                )

        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "Icon",
                    tint = glittergold,
                    modifier = Modifier.size(40.dp)
                )

                //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto

                Text(
                    text = "Comprar",
                    color = glittergold,
                    fontSize = 30.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        TextButton(
            onClick = { navController.navigate("comprar") },
            border = BorderStroke(0.dp, darkTheme),
            modifier = Modifier
                .border(1.dp, glittergold, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = darkTheme, // Cor de fundo do botão
                )

        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Icon",
                    tint = glittergold,
                    modifier = Modifier.size(40.dp)
                )

                //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto

                Text(
                    text = "Alugar",
                    color = glittergold,
                    fontSize = 30.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        TextButton(
            onClick = { navController.navigate("novo") },
            border = BorderStroke(0.dp, darkTheme),
            modifier = Modifier
                .border(1.dp, glittergold, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = darkTheme, // Cor de fundo do botão
                )

        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Icon",
                    tint = glittergold,
                    modifier = Modifier.size(40.dp)
                )

                //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto

                Text(
                    text = "Novos",
                    color = glittergold,
                    fontSize = 30.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        TextButton(
            onClick = { navController.navigate("Anuncie") },
            border = BorderStroke(0.dp, darkTheme),
            modifier = Modifier
                .border(1.dp, glittergold, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = darkTheme, // Cor de fundo do botão
                )

        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Icon",
                    tint = glittergold,
                    modifier = Modifier.size(40.dp)
                )

                //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto

                Text(
                    text = "Anuncie no App",
                    color = glittergold,
                    fontSize = 30.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        TextButton(
            onClick = { navController.navigate("sobre") },
            border = BorderStroke(0.dp, darkTheme),
            modifier = Modifier
                .border(1.dp, glittergold, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = darkTheme, // Cor de fundo do botão
                )

        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Icon",
                    tint = glittergold,
                    modifier = Modifier.size(40.dp)
                )

                //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto

                Text(
                    text = "Nosso time",
                    color = glittergold,
                    fontSize = 30.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        TextButton(
            onClick = { navController.navigate("sobre") },
            border = BorderStroke(0.dp, darkTheme),
            modifier = Modifier
                .border(1.dp, glittergold, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = darkTheme, // Cor de fundo do botão
                )

        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Icon",
                    tint = glittergold,
                    modifier = Modifier.size(40.dp)
                )

                //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto

                Text(
                    text = "Sobre nós",
                    color = glittergold,
                    fontSize = 30.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Home(){
    val navController = rememberNavController()
    HomeScreen(navController)
}