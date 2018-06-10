package com.kejeiri.courses.didemo.Controllers;

import com.kejeiri.courses.didemo.controllers.SetterInjectedController;
import com.kejeiri.courses.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;
    @Before
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GUGU,setterInjectedController.sayHello());
    }
}
