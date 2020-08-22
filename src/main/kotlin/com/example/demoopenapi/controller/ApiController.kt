package com.example.demoopenapi.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class ApiController {

    @GetMapping
    fun testApi() : String {
        return "<h1>test<h1>"
    }

    @GetMapping("/hello")
    fun hello(@RequestParam("name") name: String) : String {
        return "Hello Mr./Mrs. $name"
    }

    @PostMapping("/postMapping")
    fun postMapping(@RequestBody data: String) : String {
        return "This is your body request : $data"
    }

}