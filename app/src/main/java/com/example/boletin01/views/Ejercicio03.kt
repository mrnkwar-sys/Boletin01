package com.example.boletin01.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.boletin01.R

@Composable
fun ProfileHeader(){
    val modifier: Modifier = Modifier
    Row(
        Modifier.fillMaxSize().padding(20.dp)
    ) {
        Column() {
            HeaderBanner("Raquel")
            Text("Desarrolladora de aplicaciones multiplataforma")
        }
        UserAvatar(R.drawable.chairoikoguma)
    }
}