package com.kejeiri.courses.didemo.controllers;

import com.kejeiri.courses.didemo.services.GreetingService;
import com.kejeiri.courses.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class PropertyInjectedController {
    //since we have three beans (services implementing the Greeting interface) we need to tell spring
    // which bean to use by using the @Qualifier annotation and use the camel case service name
    @Autowired
    public @Qualifier("propertyGreetingService") GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreeting();
    }

   /* @Autowired
    //Spring through reflexion when finding the greetingServiceImpl will deduce that we will use the
    // 'GreetingServiceImpl' bean in that case no need for Qualifier, but as soon as we add a primary/default
    // service (PrimaryGreetingService), reflexion get overridden! and Spring will pick up that primary service.
    public GreetingService greetingServiceImpl;
    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }*/
}
