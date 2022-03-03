package com.example.test

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculateTest {
    fun multiply(a: Int, b: Int): Int {
        if (a == 0 || b == 0) return 0
        return (0 until b).fold(0) {
            res, _ -> res + a // Add breakpoint here; DOES work
        }
    }

    @Test
    fun `should multiply`() {
        assertEquals(0, multiply(0, 1))
        assertEquals(0, multiply(1, 0))
        assertEquals(2, multiply(1, 2))
        assertEquals(6, multiply(2, 3))
    }
}
