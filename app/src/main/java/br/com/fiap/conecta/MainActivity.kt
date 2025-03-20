package br.com.fiap.conecta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.conecta.screens.busca.BuscaScreen
import br.com.fiap.conecta.screens.login.LoginScreen
import br.com.fiap.conecta.screens.mapa.MapaScreen
import br.com.fiap.conecta.screens.menu.MenuScreen
import br.com.fiap.conecta.screens.perfil.PerfilScreen
import br.com.fiap.conecta.ui.theme.ConectaTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConectaTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "login"
                ){
                    composable(route = "login"){
                        LoginScreen(navController)
                    }
                    composable(route = "menu"){
                        MenuScreen(navController)
                    }
                    composable(route = "mapa"){
                        MapaScreen(navController)
                    }
                    composable(route = "busca"){
                        BuscaScreen(navController)
                    }
                    composable(route = "perfil"){
                        PerfilScreen(navController)
                    }
                }

            }
        }
    }
}





