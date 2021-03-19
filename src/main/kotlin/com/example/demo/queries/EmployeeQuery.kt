package com.example.demo.queries

import com.example.demo.models.Employee
import com.example.demo.services.EmployeeService
import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class EmployeeQuery(private val employeeService: EmployeeService): Query {

    @GraphQLDescription("Get all employees")
    suspend fun employees(): List<Employee> {
        return employeeService.findAll()
    }
}