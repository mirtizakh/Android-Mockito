package com.mockito.android.test_doubles.stub_test_doubles

import org.junit.Assert.assertEquals
import org.junit.Test

class StubBookServiceTest {
    @Test
    fun test_StubTestDouble() {
        val bookRepository = StubBookRepository()
        val bookService = BookService(bookRepository)
        val newBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10, 7)
        assertEquals(2, newBooksWithAppliedDiscount!!.size)
        assertEquals(450, newBooksWithAppliedDiscount[0].price)
        assertEquals(360, newBooksWithAppliedDiscount[1].price)
    }
}