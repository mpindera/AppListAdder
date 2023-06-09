package com.example.applistadder

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext


@Composable
fun BackgroundApp(
    navController: NavHostController,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xB2CFB6AF),
                        Color(0xFFDEE3E9)
                    ),
                    start = Offset(x = 0f, y = 0f),
                    end = Offset(x = 1000f, y = 500f)
                )
            )
    ) {
        AdderList(navController)
        ButtonToAdd(navController)
    }

}

@Composable
@Preview(showBackground = true)
fun BackgroundAppPreview() {
    BackgroundApp(navController = rememberNavController())
}