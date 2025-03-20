package br.com.fiap.conecta.screens.menu.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MenuCards(
    navController: NavController
) {

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()){
        Card (
            modifier = Modifier
                .padding(20.dp)
                .clickable { navController.navigate("mapa") }) {
            Row {
                Text("Locais por perto")
            }
            Spacer(modifier = Modifier.padding(bottom = 10.dp))
            Column(
                modifier = Modifier
                    .size(width = 300.dp, height = 200.dp)
                    .background(color = Color(0xFF868686))) {

                Text("Clique aqui para abrir o mapa",
                    textAlign = TextAlign.Center)

            }
        }
    }

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()){
        Card (
            modifier = Modifier
                .padding(20.dp)
                .clickable { }) {
            Row {
                Text("Roteiros")
            }
            Spacer(modifier = Modifier.padding(bottom = 15.dp))
            Column(
                modifier = Modifier
                    .size(width = 300.dp, height = 250.dp)
                    .background(color = Color(0xFF868686))) {

                Text("Clique aqui para abrir os roteiros",
                    textAlign = TextAlign.Center)

            }
        }
    }

}