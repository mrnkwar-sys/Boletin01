package com.example.boletin01.views

import android.graphics.Color
import android.graphics.drawable.Icon
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Password
import androidx.compose.material3.Icon

@Composable
fun RegisterForm(){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    OutlinedTextField(
        label = {
            Text("Email")
        },
        value = email,
        onValueChange = {
            email = it
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email Icon"
            )
        }
    )
    OutlinedTextField(
        label = {
            Text("Contraseña")
        },
        value = password,
        onValueChange = {
            password = it
        },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Password,
                contentDescription = "Password Icon"
            )
        }
    )
}