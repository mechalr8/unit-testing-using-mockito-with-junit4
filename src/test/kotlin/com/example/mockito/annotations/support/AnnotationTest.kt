package com.example.mockito.annotations.support


import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule
import java.time.LocalDate

//@RunWith(MockitoJUnitRunner::class)
class AnnotationTest {

    @JvmField
    @Rule
    val mockitoRule: MockitoRule = MockitoJUnit.rule()

    @InjectMocks
    private lateinit var bookService: BookService

    @Mock
    private lateinit var bookRepository: BookRepository

//    @Before
//    fun beforeEach(){
//        MockitoAnnotations.openMocks(this)
//    }

    @Test
    fun demoCreateMocksUsingAnnotations(){

        val book1 = Book("1234", "Mockito in Action", 530, LocalDate.now().toString())
        val book2 = Book("1235", "JUnit 5 in Action", 480, LocalDate.now().toString())

        val books = ArrayList<Book>()
        books.add(book1)
        books.add(book2)
        `when`(bookRepository.findNewBooks(7)).thenReturn(books)

        val newListWithAppliedDiscount = bookService.getNewBookWithAppliedDiscount(10, 7)

        assertEquals(2, newListWithAppliedDiscount.size)
        assertEquals(477, newListWithAppliedDiscount[0].getPrice())
        assertEquals(432, newListWithAppliedDiscount[1].getPrice())
    }
}