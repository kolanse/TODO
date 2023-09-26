package com.example.todo.navigation

sealed class Screens(val route: String) {
    object Splash: Screens("splash_screen")
    object Dashboard: Screens("dashboard")
}
