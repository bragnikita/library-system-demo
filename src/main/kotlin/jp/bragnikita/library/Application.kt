package jp.bragnikita.library

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("jp.bragnikita")
                .mainClass(Application.javaClass)
                .start()
    }
}