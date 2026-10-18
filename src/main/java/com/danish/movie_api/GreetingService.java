package com.danish.movie_api;

import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class GreetingService {

    public String greet(String name) {
        return "Hello, " + name + "! Today is " + LocalDate.now();
    }
}