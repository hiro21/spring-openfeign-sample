package com.example.demo.api

import com.example.demo.client.HelloClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
        private val client: HelloClient
) {
    @GetMapping("/hello")
    fun fetch(): String {
        return client.fetch()
    }
}