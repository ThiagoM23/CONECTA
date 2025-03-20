package br.com.fiap.conecta.screens.mapa.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun apimapa(

)
{

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Card(modifier = Modifier.fillMaxWidth()
            .height(700.dp)
            .padding(top = 15.dp)
            .clickable { }) {
            Text("Aqui aparecera um mapa",
                textAlign = TextAlign.Center)
        }
    }
}