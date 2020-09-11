package com.example.demo.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController {
    @GetMapping("/dummy")
    fun dummy(): String {
        return "dummy"
    }
}