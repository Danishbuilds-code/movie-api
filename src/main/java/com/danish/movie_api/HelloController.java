package com.danish.movie_api;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
    @GetMapping("/about")
    public String about(){
        return "Movie API - built by Danish";
    }

    @GetMapping("/status")
    public Map<String, Object> status(){
        return Map.of("app","movie-api", "running",true);
    }

    @GetMapping("/greet")
    public String greet(){
        return "Hi Danish! Today is " + LocalDate.now();
    }
}
