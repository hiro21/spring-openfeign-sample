package com.example.demo.api

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DummyControllerTest {
    @Test
    fun test() {
        val controller = DummyController()
        assertEquals("dummy", controller.dummy())
    }
}