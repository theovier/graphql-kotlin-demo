package com.example.demo.repositories

import com.example.demo.models.Company
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository

@Repository
interface CompanyRepository: ReactiveCrudRepository<Company, Long>