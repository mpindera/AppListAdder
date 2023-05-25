package com.example.applistadder.management.register

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applistadder.ui.theme.darkBrown


@Composable
fun ButtonRegister(){
    Button(elevation = ButtonDefaults.elevation(
        defaultElevation = 10.dp,
        pressedElevation = 15.dp
    ),
        colors = ButtonDefaults.buttonColors(backgroundColor = darkBrown),
        shape = RoundedCornerShape(20.dp),
        onClick = {

        }) {
        Text(text = "Create Account", color = Color.White)
    }
}
@Composable
@Preview
fun ButtonRegisterPreview() {
    ButtonRegister()
}