package com.example.applistadder.register.textfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun TextFieldPassword() {
    val maxLength = 18

    val password = remember {
        mutableStateOf("")
    }

    val lightBlue = Color(0xffd8e6ff)

    Column(
        modifier = Modifier
            .padding(horizontal = 37.dp)
            .shadow(elevation = 10.dp)
    ) {
        TextField(
            value = password.value,
            onValueChange = {
                if (it.length <= maxLength) password.value = it
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = lightBlue,
                cursorColor = Color.Black,
                disabledLabelColor = lightBlue,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            trailingIcon = {
                if (password.value.isNotEmpty()) {
                    IconButton(onClick = { password.value = "" }) {
                        Icon(
                            imageVector = Icons.Outlined.Close,
                            contentDescription = null
                        )
                    }
                }
            },
            label = {
                Text(text = "Password")
            },
            modifier = Modifier.fillMaxWidth()
        )

    }
}


@Preview(showBackground = true)
@Composable
fun TextFieldPasswordPreview() {
    TextFieldPassword()
}