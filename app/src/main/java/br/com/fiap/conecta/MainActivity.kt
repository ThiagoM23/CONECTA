package br.com.fiap.conecta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.conecta.components.FooterScreen
import br.com.fiap.conecta.login.LoginScreen
import br.com.fiap.conecta.ui.theme.ConectaTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConectaTheme {
//                    LoginScreen()
                    FooterScreen()
            }
        }
    }
}





@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    ConectaTheme {
        LoginScreen()
    }
}