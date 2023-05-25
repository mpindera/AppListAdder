package com.example.applistadder.management.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.applistadder.ui.theme.AppListAdderTheme

class MainLoginPage : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppListAdderTheme {
                UIForLogin()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainManagementPreview() {
    MainLoginPage()
}