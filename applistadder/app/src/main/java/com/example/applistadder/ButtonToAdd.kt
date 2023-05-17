package com.example.applistadder

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun ButtonToAdd() {
    var context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset(
                x = (-35).dp,
                y = (-35).dp
            ),
        contentAlignment = Alignment.BottomEnd
    ) {
        IconButton(onClick = { Toast.makeText(context,"abc",Toast.LENGTH_SHORT).show() }) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Plus",
                tint = Color.White,
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color(0xFFC7BA8D), shape = CircleShape)
            )
        }

    }
}