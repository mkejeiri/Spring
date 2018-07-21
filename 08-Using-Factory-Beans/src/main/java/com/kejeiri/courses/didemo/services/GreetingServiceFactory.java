package com.kejeiri.courses.didemo.services;

public class GreetingServiceFactory {
    private GreetingRepository repository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.repository = greetingRepository;
    }
    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "en": return new PrimaryGreetingService(repository);
            case "de": return new PrimaryGermanGreetingService(repository);
            case "es": return new PrimarySpanishGreetingService(repository);
            default:return new PrimaryGreetingService(repository);
        }
    }
}
