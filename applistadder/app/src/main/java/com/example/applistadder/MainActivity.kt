package com.example.applistadder

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.applistadder.ui.theme.AppListAdderTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel

class MainActivity : ComponentActivity() {

    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppListAdderTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = "list") {


                    composable("list") {
                        Surface(
                            modifier = Modifier.fillMaxWidth(),
                            color = MaterialTheme.colors.background
                        ) {
                            BackgroundApp(navController)
                        }
                    }

                    composable("detail/{description}") { backStackEntry ->
                        val description = backStackEntry.arguments?.getString("description")
                        Surface(
                            modifier = Modifier.fillMaxWidth(),
                            color = MaterialTheme.colors.background
                        ) {
                            DetailsScreen(description)
                        }
                    }

                    composable("addToList") {
                        Surface(
                            modifier = Modifier.fillMaxWidth(),
                            color = MaterialTheme.colors.background
                        ) {
                            AdderToList(navController)
                        }
                    }
                }
            }
        }
    }

    override fun onDestroy() {
        coroutineScope.cancel()
        super.onDestroy()
    }
}