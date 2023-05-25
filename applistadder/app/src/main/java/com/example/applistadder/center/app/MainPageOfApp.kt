package com.example.applistadder.center.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.applistadder.management.register.UIForRegister
import com.example.applistadder.ui.theme.AppListAdderTheme


class MainPageOfApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppListAdderTheme {
                UIForMainApp()
            }
        }
    }
}

@Preview
@Composable
fun MainPageOfAppPreview() {
    MainPageOfApp()
}