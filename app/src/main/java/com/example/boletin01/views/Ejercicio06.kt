package com.example.boletin01.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role

@Composable
fun RoleSelector(){
    val options = listOf<String>(
        "Frontend", "Backend", "Mobile", "Fullstack"
    )

    //selectedOption representa el valor actual y onOptionSelected escribe el nuevo valor seleccionado
    //El valor inicial sera el primer elemento de la lista (no importa mucho porque va a cambiar)
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(options[0]) }

    Column(
        //Indica que el grupo de elementos es un radioGroup
        modifier = Modifier.selectableGroup()
    ) {
        options.forEach { text ->
            Row(
                modifier = Modifier.fillMaxWidth()
                    .selectable(
                        //Indica si esta opción en la seleccionada actualmente
                        selected = (text == selectedOption),

                        //Al tocar la fila, actualiza el estado con el nuevo valor
                        onClick = {
                            onOptionSelected(text)
                        },
                        role = Role.RadioButton
                    )
            ) {

            }
        }
    }
}