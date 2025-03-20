package br.com.fiap.conecta.screens.busca.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import br.com.fiap.conecta.R

@Composable
fun Categorias(
) {

    Column {
        Row (modifier = Modifier
            .padding(30.dp)){
            Text("Categorias"
            )
        }
        Row (horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)){

            Column {
                Card(modifier = Modifier
                    .size(width = 140.dp, height = 80.dp)
                    .padding(top = 20.dp)
                    .clickable {  }) {
                    Image(painter = painterResource(id = R.drawable.imagem_bares),
                        contentDescription = "Categoria bares",
                        modifier = Modifier.weight(1f)
                            .align(Alignment.CenterHorizontally))
                }

                Card(modifier = Modifier
                    .size(width = 140.dp, height = 80.dp)
                    .padding(top = 20.dp)
                    .clickable {  }) {
                    Text("Restaurantes",
                        textAlign = TextAlign.Center)
                }
                Card(modifier = Modifier
                    .size(width = 140.dp, height = 80.dp)
                    .padding(top = 20.dp)
                    .clickable {  }) {
                    Text("Museus",
                        textAlign = TextAlign.Center)
                }
                Card(modifier = Modifier
                    .size(width = 140.dp, height = 80.dp)
                    .padding(top = 20.dp)
                    .clickable {  }) {
                    Text("Teatros",
                        textAlign = TextAlign.Center)
                }
                Card(modifier = Modifier
                    .size(width = 140.dp, height = 80.dp)
                    .padding(top = 20.dp)
                    .clickable {  }) {
                    Text("Casas de show",
                        textAlign = TextAlign.Center)
                }
            }

            Column {
                Card(modifier = Modifier
                    .size(width = 140.dp, height = 80.dp)
                    .padding(top = 20.dp)
                    .clickable {  }) {
                    Text("Atrações turísticas",
                        textAlign = TextAlign.Center)
                }
                Card(modifier = Modifier
                    .size(width = 140.dp, height = 80.dp)
                    .padding(top = 20.dp)
                    .clickable {  }) {
                    Text("Hotéis e hospedagens",
                        textAlign = TextAlign.Center)
                }
                Card(modifier = Modifier
                    .size(width = 140.dp, height = 80.dp)
                    .padding(top = 20.dp)
                    .clickable {  }) {
                    Text("Eventos e festivais",
                        textAlign = TextAlign.Center)
                }
                Card(modifier = Modifier
                    .size(width = 140.dp, height = 80.dp)
                    .padding(top = 20.dp)
                    .clickable {  }) {
                    Text("Exposições",
                        textAlign = TextAlign.Center)
                }
                Card(modifier = Modifier
                    .size(width = 140.dp, height = 80.dp)
                    .padding(top = 20.dp)
                    .clickable {  }) {
                    Text("Esporte",
                        textAlign = TextAlign.Center)
                }

            }

        }

    }

}