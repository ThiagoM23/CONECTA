package br.com.fiap.conecta.screens.perfil

import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import br.com.fiap.conecta.components.BackgroundColumn
import br.com.fiap.conecta.components.FooterScreen
import br.com.fiap.conecta.components.LogoTipo
import br.com.fiap.conecta.screens.perfil.components.PerfilHeader

@Composable

fun PerfilScreen(
    navController: NavController
){
    BackgroundColumn {
        LogoTipo()
        PerfilHeader()
        Spacer(modifier = Modifier.weight(1f))
        FooterScreen(navController)
    }

}