package com.kejeiri.courses.didemo.Controllers;

import com.kejeiri.courses.didemo.app.controllers.PropertyInjectedController;
import com.kejeiri.courses.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;
    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        //this.propertyInjectedController.greetingService = new GreetingServiceImpl();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }
    @Test
    public  void testGreeting() throws  Exception{
        assertEquals(GreetingServiceImpl.HELLO_GUGU,propertyInjectedController.sayHello());
    }
}
