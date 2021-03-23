package com.example.demo.repositories

import com.example.demo.models.Customer
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: ReactiveCrudRepository<Customer, Long>