package com.example.demo.services

import com.example.demo.models.Customer
import com.example.demo.repositories.CustomerRepository
import kotlinx.coroutines.reactive.awaitFirstOrDefault
import org.springframework.stereotype.Service

@Service
class CustomerService(private val repository: CustomerRepository) {

    suspend fun findAll(): List<Customer> {
        return repository
            .findAll()
            .collectList()
            .awaitFirstOrDefault(listOf())
    }
}