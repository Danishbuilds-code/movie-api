package com.danish.movie_api;

import org.springframework.stereotype.Service;

@Service
public class TamilMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "Vanakam! Movie API ku varaverkirom";
    }
}
