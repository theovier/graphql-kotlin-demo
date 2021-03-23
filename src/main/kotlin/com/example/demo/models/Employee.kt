package com.example.demo.models

import com.example.demo.repositories.CompanyRepository
import com.expediagroup.graphql.annotations.GraphQLIgnore
import kotlinx.coroutines.reactive.awaitFirst
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("employee")
data class Employee(@Id val id: Long, val name: String, @GraphQLIgnore val company: Long) {

    suspend fun company(@GraphQLIgnore @Autowired repository: CompanyRepository): Company {
        return repository.findById(company).awaitFirst()
    }
}