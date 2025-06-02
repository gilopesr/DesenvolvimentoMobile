package com.example.petmatch_perfil

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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

data class Pet(val nome: String, val imagemRes: Int, val descricao: String)

@Preview(showBackground = true)
@Composable
fun Catalogo() {
    val gatos = listOf(
        Pet("Lurdes", R.drawable.gato_baralho, "•Lurdes é uma gata fêmea de 3 anos viciada em baralho (as vezes ela rouba o jogo)"),
        Pet("Choris", R.drawable.gato_choris, "•Choris é um gato macho de 1 mês que adora andar de skate e miar as músicas do chorão")
    )
    val cachorros = listOf(
        Pet("Francisco Cisco", R.drawable.francisco_cisco, "•Francisco Cisco é um cachorro macho de 2 meses que adora brincar e dormir"),
        Pet("Zé", R.drawable.cachorro_horta, "•Zé é um cachorro macho de 6 meses que adora trabalhar na horta")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFDF1E5)),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .padding(top = 60.dp, start = 16.dp, end = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Encontre seu novo amigo!",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Text(text = "Deslize para ver mais opções.", fontSize = 15.sp)

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "Gatos", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            PetRow(gatos)

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = "Cachorros", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            PetRow(cachorros)
        }

        BottomNavigationBar()
    }
}

@Composable
fun PetRow(pets: List<Pet>) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp)
    ) {
        pets.forEach { pet ->
            PetCard(pet)
        }
    }
}

@Composable
fun PetCard(pet: Pet) {
    Column(
        modifier = Modifier
            .width(180.dp)
            .height(295.dp)
            .clip(RoundedCornerShape(24.dp))
            .background(Color.White)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = pet.imagemRes),
            contentDescription = "Imagem de ${pet.nome}",
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(text = pet.nome, fontSize = 20.sp, color = Color.Black)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = pet.descricao, fontSize = 15.sp, color = Color.DarkGray)
    }
}