package com.bridgelabz.helloworldspringappapplication.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldSpringAppApplicationController {
    @GetMapping("/getdata")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/query")
    public String queryParam(@RequestParam String name) {
        return "Hello " + name + " from Bridgelabz";
    }

    @GetMapping("/path/{name}")
    public String name(@PathVariable String name){
        return "Hello " + name + " from Bridgelabz";
    }

}
