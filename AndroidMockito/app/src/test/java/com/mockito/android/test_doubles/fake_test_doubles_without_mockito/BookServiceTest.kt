package com.mockito.android.test_doubles.fake_test_doubles.repository

import com.mockito.android.test_doubles.fake_test_doubles.Book
import com.mockito.android.test_doubles.fake_test_doubles.BookService
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate


class BookServiceTest {

    // region unit test
    @Test
    fun test_FakeTestDouble() {
        val bookRepository = FakeBookRepository()
        val bookService = BookService(bookRepository)

        bookService.addBook(Book("1234", "Mockito In Action", 250, LocalDate.now()))
        bookService.addBook(Book("1235", "JUnit 5 In Action", 200, LocalDate.now()))

        assertEquals(2, bookService.findNumberOfBooks());
    }
}