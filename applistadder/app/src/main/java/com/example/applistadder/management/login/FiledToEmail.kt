package com.example.applistadder.management.login

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
import com.example.applistadder.ui.theme.backgroundTextField

@Composable
fun FiledToEmail() {
    val maxLength = 30

    val email = remember {
        mutableStateOf("")
    }

    val lightBrown = backgroundTextField

    Column(
        modifier = Modifier
            .padding(horizontal = 37.dp)
            .shadow(elevation = 10.dp)
    ) {
        TextField(
            value = email.value,
            onValueChange = {
                if (it.length <= maxLength) email.value = it
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = lightBrown,
                cursorColor = Color.Black,
                disabledLabelColor = lightBrown,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            trailingIcon = {
                if (email.value.isNotEmpty()) {
                    IconButton(onClick = { email.value = "" }) {
                        Icon(
                            imageVector = Icons.Outlined.Close,
                            contentDescription = null
                        )
                    }
                }
            },
            label = {
                Text(text = "Email", color = Color.Black)
            },
            modifier = Modifier.fillMaxWidth()
        )

    }
}

@Preview
@Composable
fun FiledToLoginPreview() {
    FiledToEmail()
}