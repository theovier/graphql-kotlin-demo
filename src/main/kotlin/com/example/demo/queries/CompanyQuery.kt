package com.example.demo.queries

import com.example.demo.models.Company
import com.example.demo.models.Employee
import com.example.demo.services.CompanyService
import com.example.demo.services.EmployeeService
import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class CompanyQuery(private val companyService: CompanyService): Query {

    @GraphQLDescription("Get all companies")
    suspend fun companies(): List<Company> {
        return companyService.findAll()
    }
}