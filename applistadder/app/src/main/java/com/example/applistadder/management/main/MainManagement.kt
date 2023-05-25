package com.example.applistadder.management.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.applistadder.ui.theme.AppListAdderTheme

class MainManagement : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppListAdderTheme {
                UIForManagement()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainManagementPreview() {
    MainManagement()
}