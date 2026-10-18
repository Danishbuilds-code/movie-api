package com.danish.movie_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;
    private final MessageService messageService;

    public GreetingController(GreetingService greetingService, MessageService messageService) {
        this.greetingService = greetingService;
        this.messageService = messageService;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "Danish") String name) {
        return greetingService.greet(name);
    }

    @GetMapping("/welcome")
    public String welcome(){
        return messageService.getMessage();
    }
}