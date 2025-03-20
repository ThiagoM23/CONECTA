package br.com.fiap.conecta.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Busca() {

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 45.dp, end = 45.dp)
    ){
        OutlinedTextField(
            value = "",
            onValueChange = {
            },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            shape = RoundedCornerShape(20.dp),
            placeholder = {
                Text("Lugares para ir")
            }
        )
    }

}