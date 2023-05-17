package com.example.applistadder

import android.content.Context
import android.graphics.Paint.Align
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun AdderList() {
    val names = listOf(
        ListData("12:00", "01.05.2023", "Show"),
        ListData("13:00", "11.05.2023", "ShowBAB"),
        ListData("4:00", "15.05.2023", "ShowDAD"),
        ListData("15:00", "16.05.2023", "ShowABC"),
        ListData("6:00", "02.05.2023", "ShowABCD"),
        ListData("7:00", "05.05.2023", "ShowABCDE"),
        ListData("12:00", "01.05.2023", "Show"),
        ListData("13:00", "11.05.2023", "ShowBAB"),
        ListData("4:00", "15.05.2023", "ShowDAD"),
        ListData("15:00", "16.05.2023", "ShowABC"),
        ListData("6:00", "02.05.2023", "ShowABCD"),
        ListData("7:00", "05.05.2023", "ShowABCDE"),
        ListData("12:00", "01.05.2023", "Show"),
        ListData("13:00", "11.05.2023", "ShowBAB"),
        ListData("4:00", "15.05.2023", "ShowDAD"),
        ListData("15:00", "16.05.2023", "ShowABC"),
        ListData("6:00", "02.05.2023", "ShowABCD"),
        ListData("7:00", "05.05.2023", "ShowABCDE"),
    )
    var context = LocalContext.current
    LazyColumn {
        items(names) { listdata ->
            Row(
                modifier = Modifier
                    .shadow(elevation = 2.dp)
                    .padding(10.dp)
                    .fillMaxWidth()
                    .clickable { Toast.makeText(context,listdata.time,Toast.LENGTH_SHORT).show()},
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.padding(end = 10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(
                        text = listdata.data,
                        modifier = Modifier.padding(2.dp),
                        style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    )

                    Text(
                        text = listdata.time,
                        modifier = Modifier.padding(2.dp),
                        style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    )
                }
                Divider(
                    Modifier
                        .width(1.dp)
                        .height(50.dp)
                )
                Text(
                    text = listdata.description,
                    modifier = Modifier.padding(start = 20.dp),
                    style = TextStyle(fontSize = 16.sp)
                )
            }

        }
    }
}