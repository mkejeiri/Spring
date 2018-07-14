package com.kejeiri.courses.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello from - PrimaryGreetingService";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de saludo primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Deutscher Hauptdienst";
    }
}
