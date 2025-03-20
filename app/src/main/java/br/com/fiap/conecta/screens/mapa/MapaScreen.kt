package br.com.fiap.conecta.screens.mapa



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import br.com.fiap.conecta.components.BackgroundColumn
import br.com.fiap.conecta.components.Busca
import br.com.fiap.conecta.components.FooterScreen
import br.com.fiap.conecta.components.LogoTipo
import br.com.fiap.conecta.screens.mapa.components.apimapa

@Composable
fun MapaScreen(navController: NavController) {
    BackgroundColumn {

            Column (
                modifier = Modifier.fillMaxSize()
            ){
                LogoTipo()
                Busca()
                apimapa()
                Spacer(modifier = Modifier.weight(1f))
                FooterScreen(navController)
            }




    }

}



