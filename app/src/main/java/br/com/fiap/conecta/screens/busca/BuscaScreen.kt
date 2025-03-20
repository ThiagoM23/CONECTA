package br.com.fiap.conecta.screens.busca


import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import br.com.fiap.conecta.components.BackgroundColumn
import br.com.fiap.conecta.components.Busca
import br.com.fiap.conecta.components.FooterScreen
import br.com.fiap.conecta.components.LogoTipo
import br.com.fiap.conecta.screens.busca.components.Categorias

@Composable
fun BuscaScreen(
    navController: NavController
) {

    BackgroundColumn {
        LogoTipo()
        Busca()
        Categorias()
        Spacer(modifier = Modifier.weight(1f))
        FooterScreen(navController)
    }

}