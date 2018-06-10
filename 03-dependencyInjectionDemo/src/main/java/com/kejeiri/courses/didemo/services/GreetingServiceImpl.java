package com.kejeiri.courses.didemo.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO_GUGU ="Hello world GURUS!!!";
    @Override
    public String sayGreeting() {
        return HELLO_GUGU;
    }
}
