package com.bridgelabz.helloworldspringappapplication.controller;


import com.bridgelabz.helloworldspringappapplication.dto.User;
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
    public String name(@PathVariable String name) {
        return "Hello " + name + " from Bridgelabz";
    }

    @PostMapping("/adduser")
    public String addUser(@RequestBody User user) {
        return user.toString();
    }

    @PostMapping("/adduserparam")
    public String addUserParam(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();

    }

    @PutMapping("/updateuser")
    public String updateUser(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User();
        user.setFirstName("Annu");
        user.setLastName("Solanki");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();
    }
}
