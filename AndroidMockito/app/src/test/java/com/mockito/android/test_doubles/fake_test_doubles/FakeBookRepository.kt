package com.mockito.android.test_doubles.fake_test_doubles

import com.mockito.android.test_doubles.fake_test_doubles.Book
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