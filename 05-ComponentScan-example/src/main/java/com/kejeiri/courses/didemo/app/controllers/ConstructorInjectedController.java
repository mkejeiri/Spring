package com.kejeiri.courses.didemo.app.controllers;
import com.kejeiri.courses.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //on Spring 4.2 they enable automatic autowiring in case of constructor based component
    // no need for @Autowired
    //@Autowired //optional here!
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        //since we have three beans (services implementing the Greeting interface) we need to tell spring
        // which bean to use by using the @Qualifier annotation and use the camel case service name
        this.greetingService = greetingService;
    }
}
