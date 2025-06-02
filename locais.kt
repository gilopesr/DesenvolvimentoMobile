package com.example.petmatch_perfil

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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
fun LocaisAdocaoScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xFFFDF3E7),
        bottomBar = { BottomNavigationBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(top = 60.dp, start = 16.dp, end = 16.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Lugares para adoção\nperto de você",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 38.dp)
            )

            val locaisFicticios = listOf(
                LocalAdocao("Patinhas Felizes", "Rua das Flores, 123", "(11) 98765-4321"),
                LocalAdocao("Abrigo Animal Vida", "Av. Central, 456", "(21) 99876-5432"),
                LocalAdocao("CãoAmor Adoção", "Travessa Pet, 789", "(31) 91234-5678"),
                LocalAdocao("Gateria", "Rua Cubatão, 400", "(11) 91234-0000"),
                LocalAdocao("Cadê o Nemo", "Av. Oceano, 456", "(21) 99876-1234")
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(24.dp),
                modifier = Modifier.weight(1f)
            ) {
                locaisFicticios.forEach { local ->
                    LocalAdocaoItem(local)
                }
            }

        }
    }
}


data class LocalAdocao(
    val nome: String,
    val endereco: String,
    val telefone: String
)


@Composable
fun LocalAdocaoItem(local: LocalAdocao) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(R.drawable.perfil),
            contentDescription = null,
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
                .background(Color.White)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(
                text = local.nome,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp // tamanho maior
            )
            Text(
                text = local.endereco,
                fontSize = 18.sp
            )
            Text(
                text = local.telefone,
                fontSize = 18.sp
            )
        }
    }
}
