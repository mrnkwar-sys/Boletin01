package com.example.boletin01.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun UserAvatar(resourceId: Int, modifier: Modifier = Modifier){
    Image(
        painterResource(resourceId),
        contentDescription = "Imagen de personaje",
        modifier = Modifier.size(100.dp).clip(CircleShape).padding(8.dp)
    )
}
