package com.mockito.android.test_doubles

import com.mockito.android.test_doubles.dummy_test_doubles.Book
import com.mockito.android.test_doubles.dummy_test_doubles.BookService
import com.mockito.android.test_doubles.dummy_test_doubles.IBookRepository
import com.mockito.android.test_doubles.dummy_test_doubles.IEmailService
import com.mockito.android.test_doubles.dummy_test_doubles_without_mockito.DummyEmailService
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate


class DummyBookServiceTest {

    // region unit test
    @Test
    fun test_FakeTestDouble() {
        val bookRepository: IBookRepository = FakeBookRepository()
        val emailService: IEmailService = DummyEmailService()
        val bookService = BookService(bookRepository, emailService)

        bookService.addBook(Book("1234", "Mockito In Action", 250, LocalDate.now()))
        bookService.addBook(Book("1235", "JUnit 5 In Action", 200, LocalDate.now()))

        assertEquals(2, bookService.findNumberOfBooks())
    }
}