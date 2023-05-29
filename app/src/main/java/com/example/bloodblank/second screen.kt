package com.example.bloodblank


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController

@Composable
fun SecondScreen(navController: NavHostController){

    Button(onClick = { navController.navigate(Destination.Main.route) }) {
        Text(text = "Blood Donate ")

    }
}

