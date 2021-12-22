package com.mockito.android.test_doubles.fake_test_doubles

import com.mockito.android.test_doubles.fake_test_doubles.Book


class BookService(var bookRepository: IBookRepository) {

    fun addBook(book: Book) {
        bookRepository.saveBook(book)
    }

    fun findNumberOfBooks() = bookRepository.findAll().size
}