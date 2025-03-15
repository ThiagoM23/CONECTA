package br.com.fiap.conecta.login.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable

fun LoginForm (
    email: String,
    onEmailChange: (String) -> Unit,
    senha: String,
    onSenhaChange: (String) -> Unit,
    onForgotPassWord: () -> Unit
){


    Column {
        OutlinedTextField(
            value = email,
            onValueChange = onEmailChange,
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Gray
            ),
            shape = RoundedCornerShape(15.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            label = {
                Text("Email")
            },
            placeholder = {
                Text("Digite o seu email")
            },

            )

        Spacer(modifier = Modifier.size(15.dp))

        OutlinedTextField(
            value = senha,
            onValueChange = onSenhaChange,
            singleLine = true,
            shape = RoundedCornerShape(15.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            label = {
                Text("Senha")
            },
            placeholder = {
                Text("Digite a sua senha")
            },

            )

    }

    Row {
        Text("Esqueceu a senha?",
            modifier = Modifier
                .clickable {
                    onForgotPassWord()
                    println("Esqueci a senha clicado")
                })
    }

}