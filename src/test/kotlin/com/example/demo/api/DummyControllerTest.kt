package com.example.demo.api

import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders

internal class DummyControllerTest {

    private val mvc: MockMvc = MockMvcBuilders.standaloneSetup(DummyController()).build()

    @Test
    @Throws(Exception::class)
    fun test() {
        mvc.perform(MockMvcRequestBuilders.get("/dummy"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("dummy"))
    }
}