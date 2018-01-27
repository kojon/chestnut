package com.example.readinglist

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by xianghan on 18/1/26.
 */
@RestController
class HelloController {
    @RequestMapping("/")
    def hello() {
        return "Hello World"
    }
}
