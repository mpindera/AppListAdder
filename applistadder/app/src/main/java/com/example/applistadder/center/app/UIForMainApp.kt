package com.example.applistadder.center.app

import android.annotation.SuppressLint
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.applistadder.ui.theme.lightBrown
import com.example.applistadder.ui.theme.lightGray

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun UIForMainApp() {
    Scaffold() {
        /*TODO make "Have a great day $username"*/
        TopAppBar(
            title = {
                Text(color = lightGray, text = "Have a great day ")
            },
            actions = {
                IconButton(onClick = {

                }) {
                    Icon(Icons.Default.Search, "Search")
                }
            },
            backgroundColor = lightBrown
        )
    }

}

@Preview(showBackground = true)
@Composable
fun UIForMainAppPreview() {
    UIForMainApp()
}