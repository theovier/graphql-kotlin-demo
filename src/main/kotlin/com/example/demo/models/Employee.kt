package com.example.demo.models

import org.springframework.data.annotation.Id

data class Employee(
    @Id
    val id: Long,
    val name: String
)