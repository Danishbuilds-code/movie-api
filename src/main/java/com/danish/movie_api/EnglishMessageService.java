package com.danish.movie_api;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

@Primary
@Service
public class EnglishMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "Welcome to Movie API Project";
    }
}
