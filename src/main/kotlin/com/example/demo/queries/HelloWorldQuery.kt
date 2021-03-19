package com.example.demo.queries

import com.expediagroup.graphql.spring.operations.Query
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class HelloWorldQuery: Query {
    private val log = LoggerFactory.getLogger(HelloWorldQuery::class.java)

    fun helloWorld(): String {
        log.info("test")
        return "Hello World!"
    }
}