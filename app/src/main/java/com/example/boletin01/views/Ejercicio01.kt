package com.example.boletin01.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.boletin01.ui.theme.Boletin01Theme
import com.example.boletin01.ui.theme.Pink40

@Composable
fun HeaderBanner(title: String) {
    Text(
        text = title,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFFE94958)
    )
}

@Preview(showBackground = true)
@Composable
fun HeaderBannerPreview() {
    Boletin01Theme {
        HeaderBanner("Hola DevConnect")
    }
}