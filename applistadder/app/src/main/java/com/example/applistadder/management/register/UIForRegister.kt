package com.example.applistadder.management.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applistadder.ui.theme.lightBrown
import com.example.applistadder.ui.theme.lightWhite

@Composable
fun UIForRegister() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        lightBrown,
                        lightWhite
                    ),
                    start = Offset(x = 0f, y = 0f),
                    end = Offset(x = 1000f, y = 500f)
                )
            )
            .padding(bottom = 25.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextFieldName()
        Spacer(modifier = Modifier.padding(vertical = 10.dp))

        TextFieldEmail()
        Spacer(modifier = Modifier.padding(vertical = 10.dp))

        TextFieldPassword()
        Spacer(modifier = Modifier.padding(vertical = 10.dp))

        ButtonRegister()

    }
}

@Composable
@Preview
fun BuildUIPreview() {
    UIForRegister()
}