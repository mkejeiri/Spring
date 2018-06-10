package com.kejeiri.courses.didemo.services;

import org.springframework.stereotype.Service;

public interface GreetingRepository  {
    public String getEnglishGreeting();
    public String getSpanishGreeting();
    public String getGermanGreeting();
}
