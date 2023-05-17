package com.example.applistadder

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun AdderList() {
    val names = listOf(
        "Anna",
        "Paul",
        "David",
        "Anna",
        "Paul"
    )
    Column(modifier = Modifier.fillMaxHeight()) {
        LazyColumn {
            items(names) {
                UIOfList()
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp), text = "User: $it"
                )
                Divider(modifier = Modifier
                    .fillMaxWidth()
                    .width(3.dp))
            }
        }
    }


}