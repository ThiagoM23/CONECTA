package br.com.fiap.conecta.screens.login.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable

fun LoginFooter(
    navController: NavController,
    onLoginGoogle: () -> Unit
) {

    Column {
        Button(onClick = {navController.navigate("menu")},
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0xFFFF9800),
                    contentColor = Color.Black
                ),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        {
            Text("Avançar"
            )
        }

        Text("Login com google",

            modifier = Modifier
                .padding(top = 25.dp)
                .clickable {
                    onLoginGoogle()
                    println("Texto clicado")
                })
    }
}