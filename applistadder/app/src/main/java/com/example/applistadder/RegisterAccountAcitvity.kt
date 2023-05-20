package com.example.applistadder

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.applistadder.ui.theme.AppListAdderTheme

class RegisterAccountActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppListAdderTheme {
                val textEmail = remember {
                    mutableStateOf("")
                }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "email")
                    TextField(value = textEmail.value, onValueChange = {
                        textEmail.value = it
                    })
                    Text(text = "password")

                    Button(onClick = {

                    }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF9D640F))) {
                        Text(text = "Login", color = Color.White)
                    }
                }

            }
        }
    }
}

@Composable
@Preview
fun RegisterAccountActivityPreview() {
    RegisterAccountActivity()
}
