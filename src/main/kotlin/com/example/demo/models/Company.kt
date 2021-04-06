package com.example.demo.models

import com.example.demo.services.EmployeeService
import com.example.demo.services.PurchaseService
import com.expediagroup.graphql.annotations.GraphQLIgnore
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("company")
data class Company(@Id val id: Long, val name: String) {

    suspend fun employees(@GraphQLIgnore @Autowired service: EmployeeService): List<Employee> {
        return service.findByCompany(id)
    }

    suspend fun purchases(@GraphQLIgnore @Autowired service: PurchaseService): List<Purchase> {
        return service.findByCompany(id)
    }
}