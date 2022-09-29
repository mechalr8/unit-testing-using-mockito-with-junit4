package com.example.mockito.annotations.support

class   BookService(bookRepository: BookRepository) {
    private var bookRepository: BookRepository? = bookRepository

    fun getNewBookWithAppliedDiscount(discountRate: Int, days: Int): List<Book>{
        val newBooks = bookRepository?.findNewBooks(days)

        newBooks?.forEach {
            val price = it.getPrice()
            val newPrice = price - (discountRate * price / 100)
            it.setPrice(newPrice)
        }

        return newBooks!!
    }

}