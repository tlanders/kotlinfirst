package biz.lci.kotlinfirst.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class HelloController {
    @RequestMapping("/hello")
    fun hello(@RequestParam name: String, model : Model) : String {
        model["user"] = name
        return "hello"
    }
}