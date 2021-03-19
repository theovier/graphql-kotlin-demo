package com.example.demo.models

import org.springframework.data.annotation.Id

data class Employee(
    @Id
    val name: String,
    val companyId: Long
)