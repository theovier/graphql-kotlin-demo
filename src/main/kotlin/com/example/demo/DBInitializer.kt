package com.example.demo

import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource
import io.r2dbc.spi.ConnectionFactory
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.r2dbc.connection.init.CompositeDatabasePopulator
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator

@Configuration
class DBInitializer {

    @Bean
    fun initializer(@Qualifier("connectionFactory") connectionFactory: ConnectionFactory): ConnectionFactoryInitializer {
        return ConnectionFactoryInitializer().apply {
            setConnectionFactory(connectionFactory)
            setDatabasePopulator(CompositeDatabasePopulator().apply {
                addPopulators(ResourceDatabasePopulator(ClassPathResource("/migrations/schema.sql")))
                addPopulators(ResourceDatabasePopulator(ClassPathResource("/seeder/company.sql")))
                addPopulators(ResourceDatabasePopulator(ClassPathResource("/seeder/employee.sql")))
                addPopulators(ResourceDatabasePopulator(ClassPathResource("/seeder/customer.sql")))
                addPopulators(ResourceDatabasePopulator(ClassPathResource("/seeder/purchase.sql")))
            })
        }
    }
}