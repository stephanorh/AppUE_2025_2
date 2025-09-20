package dev.lchang.appue.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen()
{
    Column(
        modifier = Modifier.fillMaxSize()

    )
    {

        //Bienvenido a la pantalla principal
        Text(text = "Bienvenido a la pantalla principal")
    }
}