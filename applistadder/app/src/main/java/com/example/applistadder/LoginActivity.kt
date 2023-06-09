package com.example.applistadder

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.applistadder.ui.theme.AppListAdderTheme

class LoginActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppListAdderTheme {
                val context = LocalContext.current
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Button(onClick = {
                        val intent = Intent(context, LoginAccountActivity::class.java)
                        context.startActivity(intent)
                        finish()
                    }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF9D640F))) {
                        Text(text = "Login", color = Color.White)
                    }

                    Button(onClick = {
                        val intent = Intent(context, RegisterAccountActivity::class.java)
                        context.startActivity(intent)
                        finish()
                    }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF9D6E0F))) {
                        Text(text = "Register", color = Color.White)
                    }
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
