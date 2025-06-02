// src/main/java/com/example/petmatch_perfil/PerfilScreen.kt
package com.example.petmatch_perfil

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Scaffold

@Preview(showBackground = true)
@Composable
fun PerfilScreenWrapper() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xFFFDF3E7),
        bottomBar = { BottomNavigationBar() }
    ) { innerPadding ->
        PerfilScreen(modifier = Modifier.padding(innerPadding))
    }
}


@Composable
fun PerfilScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFDF3E7))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "Foto de Perfil",
            modifier = Modifier
                .size(160.dp)
                .clip(CircleShape)
                .background(Color.White)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "nome",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(32.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CampoInfo(titulo = "telefone")
            CampoInfo(titulo = "endereço")
            CampoInfo(titulo = "email")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Esqueci a senha",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Termos e Condições",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Política de Privacidade",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun CampoInfo(titulo: String) {
    Box(
        modifier = Modifier
            .width(300.dp)
            .height(50.dp)
            .padding(vertical = 8.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFFBF9983)),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}
