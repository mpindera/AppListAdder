package com.example.applistadder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.applistadder.ui.theme.AppListAdderTheme

class LoginActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppListAdderTheme {

                Button(onClick = {

                }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF0f9D58))) {
                    Text(text = "Login", color = Color.White)
                }

                Button(onClick = {

                }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF0f9D58))) {
                    Text(text = "Register", color = Color.White)
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginActivityPreview() {
    LoginActivity()
}
