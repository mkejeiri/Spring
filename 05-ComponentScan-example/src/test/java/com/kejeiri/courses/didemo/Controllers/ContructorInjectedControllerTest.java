package com.kejeiri.courses.didemo.Controllers;

import com.kejeiri.courses.didemo.app.controllers.ConstructorInjectedController;
import com.kejeiri.courses.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContructorInjectedControllerTest {
    private ConstructorInjectedController contructorInjectedController;

    @Before
    public void setUp()throws Exception{
        this.contructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GUGU,this.contructorInjectedController.sayHello());
    }
}
