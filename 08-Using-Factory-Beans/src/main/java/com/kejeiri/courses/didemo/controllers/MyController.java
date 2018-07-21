package com.kejeiri.courses.didemo.controllers;

import com.kejeiri.courses.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller indicates a spring bean component, i.e it makes it as a spring component managed by spring app context,
//spring will create an instance of controller at startup and put into spring app context
@Controller
public class MyController {
    private GreetingService greetingService;

    //public MyController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Inside hello method: =========>");
        return greetingService.sayGreeting();
    }
}
