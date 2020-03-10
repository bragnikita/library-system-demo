package jp.bragnikita.library

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession
import io.micronaut.spring.tx.annotation.Transactional
import jp.bragnikita.library.domain.Book
import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

import javax.validation.constraints.NotNull

@Singleton
open class BookRepositoryImpl() : BookRepository {

    @Transactional
    override fun save(@NotNull book: Book): Book {
        TODO("Not yet implemented")
    }

    override fun delete(@NotNull id: Int) {
        TODO("Not yet implemented")
    }

    override fun findByTitle(title: String): List<Book> {
        TODO("Not yet implemented")
    }

    override fun findByAuthor(author: String): List<Book> {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<Book> {
        TODO("Not yet implemented")
    }
}