package com.example.applistadder.management.register

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.applistadder.ui.theme.AppListAdderTheme

class MainRegisterPage : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppListAdderTheme {
                UIForRegister()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainManagementPreview() {
    MainRegisterPage()
}