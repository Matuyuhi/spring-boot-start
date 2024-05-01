package tokyo.yuhi.springbootstart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootStartApplication

fun main(args: Array<String>) {
    runApplication<SpringBootStartApplication>(*args)
}
