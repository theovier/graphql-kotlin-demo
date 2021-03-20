package com.example.demo.models

import org.springframework.data.annotation.Id

data class Company(
    @Id
    val id: Long,
    val name: String
)