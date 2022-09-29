package com.example.mockito.annotations.support


interface BookRepository {
    fun findNewBooks(days: Int): List<Book>
}
