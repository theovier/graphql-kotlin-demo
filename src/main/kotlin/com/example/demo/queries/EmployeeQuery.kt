package com.example.demo.queries

import com.example.demo.models.Employee
import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class EmployeeQuery: Query {

    private val employees = listOf(
        Employee(name = "Mike", companyId = 1),
        Employee(name = "John", companyId = 1),
        Employee(name = "Steve", companyId = 2)
    )

    @GraphQLDescription("Get all employees")
    fun employees(): List<Employee> {
        return employees
    }

}