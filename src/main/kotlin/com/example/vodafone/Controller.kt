package com.example.vodafone

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class Controller {
    @GetMapping
    fun helloWorld(): String {
        return "Hello Kafein & Vodafone!"
    }
    
}