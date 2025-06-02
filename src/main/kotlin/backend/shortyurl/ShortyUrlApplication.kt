package backend.shortyurl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShortyUrlApplication

fun main(args: Array<String>) {
    runApplication<ShortyUrlApplication>(*args)
}
