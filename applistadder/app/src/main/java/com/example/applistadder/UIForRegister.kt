package com.example.applistadder

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
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

@Composable
fun UIForRegister(){
    val name = remember {
        mutableStateOf("")
    }
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(bottom = 25.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //Name
        OutlinedTextField(
            modifier = Modifier.padding(bottom = 25.dp),
            value = name.value,
            onValueChange = {
                name.value = it
            },
            label = {
                Text(text = "Nickname")
            })

        //Email
        OutlinedTextField(
            modifier = Modifier.padding(bottom = 25.dp),
            value = email.value,
            onValueChange = {
                email.value = it
            },
            label = {
                Text(text = "Email")
            })

        //Password
        OutlinedTextField(
            modifier = Modifier.padding(bottom = 25.dp),
            value = password.value,
            onValueChange = {
                password.value = it
            },
            label = {
                Text(text = "Password")
            })
        Button(onClick = {
            //TODO go to main page.
        }) {
            Text(text = "Register")
        }
    }
}
@Composable
@Preview
fun BuildUIPreview() {
    UIForRegister()
}