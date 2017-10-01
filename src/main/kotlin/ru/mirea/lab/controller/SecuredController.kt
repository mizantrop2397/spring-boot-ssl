package ru.mirea.lab.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import ru.mirea.lab.service.SecuredService


@Controller
class SecuredController {
    @Autowired
    lateinit var service: SecuredService

    @GetMapping("/")
    fun greeting(model: Model) = with(model) {
        "index"
    }

}