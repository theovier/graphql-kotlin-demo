package com.example.demo.services

import com.example.demo.models.Company
import com.example.demo.models.Employee
import com.example.demo.repositories.CompanyRepository
import com.example.demo.repositories.EmployeeRepository
import kotlinx.coroutines.reactive.awaitFirstOrDefault
import org.springframework.stereotype.Service

@Service
class CompanyService(private val repository: CompanyRepository) {

    suspend fun findAll(): List<Company> {
        return repository
            .findAll()
            .collectList()
            .awaitFirstOrDefault(listOf())
    }
}