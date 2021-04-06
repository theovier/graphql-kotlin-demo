package com.example.demo.models

import com.example.demo.services.PurchaseService
import com.expediagroup.graphql.annotations.GraphQLIgnore
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("customer")
data class Customer(@Id val id: Long,  val name: String) {

    suspend fun purchases(@GraphQLIgnore @Autowired service: PurchaseService): List<Purchase> {
        return service.findByCustomer(id)
    }
}