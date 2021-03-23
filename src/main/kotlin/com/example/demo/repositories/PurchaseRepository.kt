package com.example.demo.repositories

import com.example.demo.models.Purchase
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface PurchaseRepository: ReactiveCrudRepository<Purchase, Long> {
    fun findByCustomer(customerId: Long): Flux<Purchase>
    fun findByCompany(companyId: Long): Flux<Purchase>
}