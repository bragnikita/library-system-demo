package jp.bragnikita.library

import jp.bragnikita.library.domain.Book

interface BookRepository {
    fun save(book: Book): Book
    fun delete(id: Int)
    fun findByTitle(title: String): List<Book>
    fun findByAuthor(author: String): List<Book>
    fun getAll(): List<Book>
}