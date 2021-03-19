package com.example.demo.repositories

import com.example.demo.models.Employee
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository: ReactiveCrudRepository<Employee, Long>