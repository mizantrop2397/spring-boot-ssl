package ru.mirea.lab.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SecuredController {
    @GetMapping("/")
    fun greeting(model: Model) = with(model) {
        "index"
    }
}