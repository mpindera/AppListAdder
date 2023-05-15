package com.example.applistadder

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonToAdd() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset(
                x = (-35).dp,
                y = (-35).dp
            ),
        contentAlignment = Alignment.BottomEnd
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Plus",
            tint = Color.White,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(color = Color(0xFF966874), shape = CircleShape)
        )
    }
}