package br.com.fiap.conecta.screens.login


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.conecta.components.BackgroundColumn
import br.com.fiap.conecta.screens.login.components.LoginFooter
import br.com.fiap.conecta.screens.login.components.LoginHeader
import br.com.fiap.conecta.screens.login.components.loginform

@Composable


fun LoginScreen(navController: NavController) {

    var email by remember {
        mutableStateOf("")
    }

    var senha by remember {
        mutableStateOf("")
    }

    BackgroundColumn {
        LoginHeader()
        Spacer(modifier = Modifier.size(60.dp))
        loginform(
                email = email,
            onEmailChange = {email = it
            },
            senha = senha,
            onSenhaChange = {senha = it},
            onForgotPassWord = { println("Esqueci a senha clicado")}
        )

        Spacer(modifier = Modifier.size(90.dp))
        LoginFooter(
            navController,
            onLoginGoogle = {
                println("Login com o google")
            }
        )
    }
}
