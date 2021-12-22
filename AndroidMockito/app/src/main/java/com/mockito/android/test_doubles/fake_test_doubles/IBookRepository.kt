package com.mockito.android.test_doubles.fake_test_doubles

import com.mockito.android.test_doubles.fake_test_doubles.Book

interface IBookRepository {

    fun saveBook(book: Book)

    fun findAll(): Collection<Book>
}