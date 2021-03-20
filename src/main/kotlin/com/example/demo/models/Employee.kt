package com.example.demo.models

import com.example.demo.repositories.CompanyRepository
import com.expediagroup.graphql.annotations.GraphQLIgnore
import kotlinx.coroutines.reactive.awaitFirst
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id

data class Employee(@Id val id: Long, val name: String, @GraphQLIgnore val company_id: Long) {
    suspend fun company(@GraphQLIgnore @Autowired repository: CompanyRepository): Company {
        return repository.findById(company_id).awaitFirst()
    }
}