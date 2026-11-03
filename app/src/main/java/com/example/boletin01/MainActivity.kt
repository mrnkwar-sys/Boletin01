package com.example.boletin01

import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.boletin01.ui.theme.Boletin01Theme
import com.example.boletin01.ui.theme.Pink40
import com.example.boletin01.views.HeaderBanner

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Boletin01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HeaderBanner(
                        title = "Hola Mundo"
                    )
                }
            }
        }
    }
}