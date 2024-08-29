package com.example.passobjusingnavigation

import java.io.Serializable

data class Employee(
    val name: String,
    val title: String,
    val email: String,
    val phone: String,
    val address: String,
    val salary: String,
    ): Serializable
