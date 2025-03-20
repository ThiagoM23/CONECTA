package br.com.fiap.conecta.screens.perfil.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.fiap.conecta.R

@Composable
fun PerfilHeader() {


    Box(
        modifier = Modifier.size(width = 300.dp, height = 300.dp)
    ) {

        Box(modifier = Modifier.fillMaxSize()) {
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable { },
                shape = CircleShape
            ) {
                Image(
                    painter = painterResource(id = R.drawable
                        .icon_perfil),
                    contentDescription = "Foto de perfil",
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterHorizontally)
                )

            }
        }

        Box(contentAlignment = Alignment.BottomEnd) {
            Card(
                modifier = Modifier
                    .size(80.dp)
                    .clickable {},
                shape = CircleShape
            ) {
                Image(
                    painter = painterResource(id = R.drawable
                        .icon_camera),
                    contentDescription = "Foto de perfil",
                    modifier = Modifier.weight(1f)
                )
            }

        }

    }

    Text("Usuario")
}
