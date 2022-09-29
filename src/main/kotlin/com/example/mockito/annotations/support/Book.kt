package com.example.mockito.annotations.support

class Book(
    private var bookId: String?,
    private var title: String?,
    private var price: Int?,
    private var publishedDate: String?
) {

    fun setBookId(bookId: String){
        this.bookId = bookId
    }

    fun getBookId(): String{
        return bookId!!
    }

    fun setTitle(title: String){
        this.title = title
    }

    fun getTitle(): String{
        return title!!
    }

    fun setPrice(price: Int){
        this.price = price
    }

    fun getPrice(): Int{
        return price!!
    }

    fun setPublishedDate(publishedDate: String){
        this.publishedDate = publishedDate
    }

    fun getPublishedDate(): String{
        return publishedDate!!
    }
}
