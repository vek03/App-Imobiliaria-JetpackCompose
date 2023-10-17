package com.example.appmobiliaria.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appmobiliaria.R
import com.example.appmobiliaria.ui.theme.DarkGreen
import com.example.appmobiliaria.ui.theme.darkTheme
import com.example.appmobiliaria.ui.theme.glittergold

@Composable
fun ImgCard(text: String, preco: String, colorPreco: Color, imgPath: Painter){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .width(170.dp)
    ) {
        Column (
            modifier = Modifier.background(Color.Black)
        ) {
            Image(
                painter = imgPath,
                contentDescription = "IMG Casa"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = text,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                color = glittergold,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = preco,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                color = colorPreco,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun ImgCardPessoa(text: String, imgPath: Painter){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .width(170.dp),
    ) {
        Column (
            modifier = Modifier.background(Color.Black)
        ){
            Image(
                painter = imgPath,
                contentDescription = "IMG Person"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = text,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                color = glittergold
            )


            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview(){
    Row (
        modifier = Modifier.height(300.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        ImgCard(
            "Casa Simples",
            "R$ 150.000,00",
            Color.Black,
            painterResource(R.drawable.casa1)
        )

        ImgCard(
            "Casa Moderna",
            "R$ 50.000,00",
            DarkGreen,
            painterResource(R.drawable.casa2)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreviewCorretor(){
    Row (
        modifier = Modifier.height(300.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        ImgCardPessoa(
            "Corretor Vek",
            painterResource(R.drawable.vek)
        )

        ImgCardPessoa(
            "Corretor Victor",
            painterResource(R.drawable.victor)
        )
    }
}

