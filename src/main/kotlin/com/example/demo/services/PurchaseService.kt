package com.example.demo.services

import com.example.demo.models.Employee
import com.example.demo.models.Purchase
import com.example.demo.repositories.EmployeeRepository
import com.example.demo.repositories.PurchaseRepository
import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.reactive.awaitFirstOrDefault
import org.springframework.stereotype.Service

@Service
class PurchaseService(private val repository: PurchaseRepository) {

    suspend fun findAll(): List<Purchase> {
        return repository
            .findAll()
            .collectList()
            .awaitFirstOrDefault(listOf())
    }

    suspend fun findByCompany(companyId: Long): List<Purchase> {
        return repository.
            findByCompany(companyId)
            .collectList()
            .awaitFirst()
    }

    suspend fun findByCustomer(customerId: Long): List<Purchase> {
        return repository.
            findByCompany(customerId)
            .collectList()
            .awaitFirst()
    }
}