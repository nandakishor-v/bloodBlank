package com.example.bloodblank

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


sealed class Destination(val route:String){
    object Main:Destination("Main")
    object Second:Destination("Second")
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavigationAppHost(navController = navController)

        }
    }
}
@Composable
fun NavigationAppHost(navController: NavHostController){
    NavHost(navController =navController , startDestination = "Second"){
        composable(Destination.Main.route){
            Mainscreen()
        }
        composable(Destination.Second.route){
            SecondScreen(navController)
        }
    }

}
