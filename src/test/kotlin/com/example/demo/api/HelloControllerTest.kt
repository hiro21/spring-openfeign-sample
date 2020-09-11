package com.example.demo.api

import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

internal class HelloControllerTest {

    private val mvc: MockMvc = MockMvcBuilders.standaloneSetup(HelloController()).build()

    @Test
    @Throws(Exception::class)
    fun testGetOk() {
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("test"))
    }
}