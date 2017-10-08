package ru.mirea.lab.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication.run as runApp

@SpringBootApplication(scanBasePackages = arrayOf("ru"))
open class SecuredApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApp(SecuredApplication::class.java, *args)
        }
    }
}