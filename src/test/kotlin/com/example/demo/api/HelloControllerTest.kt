package com.example.demo.api

import com.example.demo.client.HelloClient
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@ExtendWith(SpringExtension::class)
@WebMvcTest(HelloController::class)
internal class HelloControllerTest {

    @Autowired
    private lateinit var mvc: MockMvc
    @MockkBean
    private lateinit var client: HelloClient

    @Test
    @Throws(Exception::class)
    fun testGetOk() {

        every { client.fetch() } returns "mock return"
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("mock return"))
    }
}