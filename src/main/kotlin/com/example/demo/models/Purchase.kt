package com.example.demo.models

import com.example.demo.repositories.CompanyRepository
import com.example.demo.repositories.CustomerRepository
import com.expediagroup.graphql.annotations.GraphQLIgnore
import kotlinx.coroutines.reactive.awaitFirst
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id

data class Purchase(@Id val id: Long, val company: Long, val customer: Long, val amount: Float) {

    suspend fun company(@GraphQLIgnore @Autowired repository: CompanyRepository): Company {
        return repository.findById(company).awaitFirst()
    }

    suspend fun customer(@GraphQLIgnore @Autowired repository: CustomerRepository): Customer {
        return repository.findById(customer).awaitFirst()
    }
}