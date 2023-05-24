package com.example.applistadder

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applistadder.register.textfield.ButtonRegister
import com.example.applistadder.register.textfield.TextFieldEmail
import com.example.applistadder.register.textfield.TextFieldName
import com.example.applistadder.register.textfield.TextFieldPassword

@Composable
fun UIForRegister() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
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