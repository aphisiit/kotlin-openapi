package com.example.demoopenapi.controller

import org.springframework.core.io.ClassPathResource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.io.File

@RestController
class IndexController {

    @GetMapping
    fun index() : String {
        return ClassPathResource("openApi/apiConfig.yaml").file.readText()
    }

}