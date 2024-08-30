package com.example.passobjusingnavigation

import java.io.Serializable

data class Employee(
    val name: String = "John Doe",
    val title: String = "Software Engineer",
    val email: String = "john@example.com",
    val phone: String = "0123456789",
    val address: String = "Dhaka, Bangladesh",
    val salary: String = "50000"
): Serializable

