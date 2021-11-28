package com.mockito.android.test_doubles.fake_test_doubles

interface BookRepository {

    fun saveBook(book: Book)

    fun findAll(): Collection<Book>
}