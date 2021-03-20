package com.example.demo.repositories

import com.example.demo.models.Employee
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface EmployeeRepository: ReactiveCrudRepository<Employee, Long> {
    fun findByName(name: String): Flux<Employee>
    fun findByCompany(companyId: Long): Flux<Employee>
}