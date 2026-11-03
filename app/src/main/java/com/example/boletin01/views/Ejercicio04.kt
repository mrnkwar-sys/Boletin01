package com.example.boletin01.views

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun UserNameInput(){
    var userName by remember { mutableStateOf("") }

    TextField(
        value = userName,
        onValueChange = {
            userName = it
        }
    )

    Text("Hola, $userName!")
}