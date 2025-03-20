package br.com.fiap.conecta.components

import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.conecta.ui.theme.Montserrat

@Composable

fun LogoTipo () {
    Row (
        modifier = Modifier.padding(start = 45.dp, top = 45.dp, bottom = 15.dp)
    ){
        Text(
            text = buildAnnotatedString {
                append("Conecta")
                withStyle(style = SpanStyle(color = Color(0xFFFF9800))) {
                    append(".")
                }
            },
            modifier = Modifier
                .fillMaxWidth(),
            fontFamily = Montserrat,
            fontSize = 30.sp,
            textAlign = TextAlign.Start

        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewLogoTipo(){
    LogoTipo()
}