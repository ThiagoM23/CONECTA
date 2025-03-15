package br.com.fiap.conecta.login.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.conecta.ui.theme.Montserrat
@Composable
fun LoginHeader (){
    Column (
        modifier = Modifier
            .padding(50.dp)
            .fillMaxWidth()
//                    .background(color = Color.Red)){
    ) {
        Text(
            text = buildAnnotatedString {
                append("Conecta")
                withStyle(style = SpanStyle(color = Color(0xFFFF9800))) {
                    append(".")
                }
            },
            modifier = Modifier.fillMaxWidth()
                .padding(top = 60.dp),
            fontFamily = Montserrat,
            fontSize = 50.sp,
            textAlign = TextAlign.Center

        )
        Text(
            text = buildAnnotatedString {
                append("Acesso")
                withStyle(style = SpanStyle(color = Color(0xFFFF9800))) {
                    append(" sem")
                }
                append(" barreiras,\npara")
                withStyle(style = SpanStyle(color = Color(0xFFFF9800))) {
                    append(" todos")
                }
                append(".")
            },
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(start = 7.dp)
        )
    }
}
