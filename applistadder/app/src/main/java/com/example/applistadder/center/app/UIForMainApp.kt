package com.example.applistadder.center.app

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.applistadder.ui.theme.lightBrown
import com.example.applistadder.ui.theme.lightGray

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun UIForMainApp() {
    var searchText by remember {
        mutableStateOf("")
    }
    TopAppBar(
        title = {
            TextField(
                value = searchText,
                onValueChange = { searchText = it },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(color = Color.White),
                placeholder = { Text(color = lightGray, text = "Have a great day ") },
                leadingIcon = {
                    Icon(Icons.Default.Search, "Search")
                }
            )
        },
        backgroundColor = lightBrown
    )

}

//Text(color = lightGray, text = "Have a great day ")
@Preview(showBackground = true)
@Composable
fun UIForMainAppPreview() {
    UIForMainApp()
}