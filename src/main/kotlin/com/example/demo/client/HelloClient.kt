package com.example.demo.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "HelloClient", url = "http://localhost:8080")
interface HelloClient {
    @GetMapping(value = ["dummy"])
    fun fetch(): String
}