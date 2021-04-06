package com.example.demo.services

import com.example.demo.models.Employee
import com.example.demo.repositories.EmployeeRepository
import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.reactive.awaitFirstOrDefault
import org.springframework.stereotype.Service

@Service
class EmployeeService(private val employeeRepository: EmployeeRepository) {

    suspend fun findAll(): List<Employee> {
        return employeeRepository
            .findAll()
            .collectList()
            .awaitFirstOrDefault(listOf())
    }

    suspend fun findByCompany(companyId: Long): List<Employee> {
        return employeeRepository.
            findByCompany(companyId)
            .collectList()
            .awaitFirst()
    }
}