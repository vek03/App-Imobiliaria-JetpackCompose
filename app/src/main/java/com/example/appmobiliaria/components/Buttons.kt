package com.example.appmobiliaria.components

import android.widget.Space
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.twotone.Favorite
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.TextButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.appmobiliaria.ui.theme.Red
import com.example.appmobiliaria.views.HomeScreen
import com.example.appmobiliaria.views.NovoScreen

//BOTAO COM BORDA VERMELHA
@Composable
fun RedButton(text: String, icon: ImageVector, onClick:() -> Unit) {
    TextButton(
        onClick = onClick,
        border = BorderStroke(0.dp, Color.Red),
        modifier = Modifier
            .border(1.dp, Color.White, MaterialTheme.shapes.extraSmall)
            .width(315.dp)
            .height(80.dp)
            .background(
                color = Red, // Cor de fundo do botão
            )

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )

            //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto

            Text(
                text = text,
                color = Color.White,
                fontSize = 30.sp
            )
        }
    }
}


@Composable
fun LittleRedButton(text: String, icon: ImageVector, onClick:() -> Unit) {
    TextButton(
        onClick = onClick,
        border = BorderStroke(0.dp, Color.Red),
        modifier = Modifier
            .border(1.dp, Red, MaterialTheme.shapes.extraSmall)
            .fillMaxWidth()
            .height(60.dp)
            .background(
                color = Red, // Cor de fundo do botão
            )

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )

            //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto

            Text(
                text = text,
                color = Color.White,
                fontSize = 20.sp
            )
        }
    }
}

//BOTAO COM FUNDO BRANCO
@Composable
fun WhiteButton(text: String, icon: ImageVector, onClick:() -> Unit){
    TextButton(
        onClick = onClick,
        border = BorderStroke(0.dp, Color.White),
        modifier = Modifier
            //.border(1.dp, Color.White, MaterialTheme.shapes.extraLarge)
            .width(315.dp)
            .height(80.dp)
            .background(
                Color.White,
                shape = RoundedCornerShape(50.dp)
            ),

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto
            Text(
                text = text,
                color = Red,
                fontSize = 30.sp
            )

            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = Red,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}


@Composable
fun BackButton(onClick:() -> Unit){
    TextButton(onClick = onClick) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Icon",
            tint = Color.White,
            modifier = Modifier.size(30.dp)
        )
    }
}






@Preview(showBackground = true)
@Composable
fun ButtonRedPreview(){
    val navController = rememberNavController()
    Column(
        //modifier = Modifier.fillMaxSize()
    ){
        //BTN VERMELHO
        RedButton("Olá", Icons.TwoTone.Favorite){
            navController.navigate("comprar")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ButtonWhitePreview(){
    val navController = rememberNavController()
    Column(
        modifier = Modifier.background(Red)
    ){
        //BTN BRANCO
        WhiteButton("Olá", Icons.Default.KeyboardArrowRight){
            navController.navigate("comprar")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ButtonLittleRedPreview(){
    val navController = rememberNavController()
    Column(
        modifier = Modifier.background(Red)
    ){
        //BTN BRANCO
        LittleRedButton("Olá", Icons.Default.KeyboardArrowRight){
            navController.navigate("comprar")
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



