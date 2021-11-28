package com.mockito.android.test_doubles.fake_test_doubles_without_mockito

import com.mockito.android.test_doubles.fake_test_doubles.Book
import com.mockito.android.test_doubles.fake_test_doubles.IBookRepository

class FakeBookRepository : IBookRepository {

    // In memory database Hashmap or list
    private val bookStore : HashMap<String, Book> = HashMap()

    override fun saveBook(book: Book) {
        bookStore.put(book.bookId,book)
    }

    override fun findAll(): Collection<Book> {
        return bookStore.values
    }
}