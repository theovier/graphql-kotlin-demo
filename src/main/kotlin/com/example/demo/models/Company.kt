package com.example.demo.models

import com.example.demo.repositories.EmployeeRepository
import com.example.demo.repositories.PurchaseRepository
import com.expediagroup.graphql.annotations.GraphQLIgnore
import kotlinx.coroutines.reactive.awaitFirst
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("company")
data class Company(@Id val id: Long, val name: String) {

    suspend fun employees(@GraphQLIgnore @Autowired repository: EmployeeRepository): List<Employee> {
        return repository.findByCompany(id).collectList().awaitFirst();
    }

    suspend fun purchases(@GraphQLIgnore @Autowired repository: PurchaseRepository): List<Purchase> {
        return repository.findByCompany(id).collectList().awaitFirst();
    }
}