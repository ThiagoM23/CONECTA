package br.com.fiap.conecta.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.conecta.R

@Composable

fun FooterScreen (
    navController: NavController
) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)

    ) {

        Button(
            onClick = {navController.navigate("menu")},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Black
            )

        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_home),
                    contentDescription = "Icone Inicio",
                    modifier = Modifier.size(25.dp)
                )
                Text("Início")
            }

        }

        Button(
            onClick = {navController.navigate("mapa")},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Black
            )

            ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_bussola),
                    contentDescription = "Icone Mapa",
                    modifier = Modifier.size(25.dp)
                )
                Text("Mapa")
            }
        }

        Button(
            onClick = {navController.navigate("busca")},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Black
            )

            ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_lupa),
                    contentDescription = "Icone busca",
                    modifier = Modifier.size(25.dp)
                )
                Text("Busca")
            }
        }
        Button(
            onClick = {navController.navigate("perfil")},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Black
            )

            ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_person),
                    contentDescription = "Icone home",
                    modifier = Modifier.size(25.dp)
                )
                Text("Perfil")
            }
        }


    }

}
