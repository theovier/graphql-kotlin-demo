package com.example.demo.queries

import com.example.demo.models.Customer
import com.example.demo.services.CustomerService
import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class CustomerQuery(private val customerService: CustomerService): Query {

    @GraphQLDescription("Get all customers")
    suspend fun customers(): List<Customer> {
        return customerService.findAll()
    }
}