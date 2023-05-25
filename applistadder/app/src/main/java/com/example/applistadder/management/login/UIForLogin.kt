package com.example.applistadder.management.login

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applistadder.ui.theme.lightBrown
import com.example.applistadder.ui.theme.lightWhite

@Composable
fun UIForLogin() {
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
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        FiledToEmail()
        Spacer(modifier = Modifier.padding(vertical = 10.dp))

        FieldToPassword()
        Spacer(modifier = Modifier.padding(vertical = 10.dp))

        ButtonLogin()

    }
}

@Preview
@Composable
fun UIForLoginPreview() {
    UIForLogin()
}