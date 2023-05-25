package com.example.applistadder.management.main

import android.content.Intent
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applistadder.management.register.MainRegisterPage

@Composable
fun ButtonToPageRegister() {

    val mContext = LocalContext.current

    Button(elevation = ButtonDefaults.elevation(
        defaultElevation = 10.dp,
        pressedElevation = 15.dp
    ),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
        shape = RoundedCornerShape(20.dp),
        onClick = {
            mContext.startActivity(Intent(mContext, MainRegisterPage::class.java))
        }) {
        Text(text = "Register", color = Color.White)
    }
}

@Preview
@Composable
fun ButtonToPageRegisterPreview() {
    ButtonToPageRegister()
}