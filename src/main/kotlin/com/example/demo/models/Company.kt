package com.example.demo.models

import com.example.demo.repositories.EmployeeRepository
import com.expediagroup.graphql.annotations.GraphQLIgnore
import kotlinx.coroutines.reactive.awaitFirst
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id

data class Company(@Id val id: Long, val name: String) {

    suspend fun employees(@GraphQLIgnore @Autowired repository: EmployeeRepository): List<Employee> {
        return repository.findByCompany(id).collectList().awaitFirst();
    }
}