package com.kejeiri.courses.didemo;

import com.kejeiri.courses.didemo.app.controllers.ConstructorInjectedController;
import com.kejeiri.courses.didemo.app.controllers.MyController;
import com.kejeiri.courses.didemo.app.controllers.PropertyInjectedController;
import com.kejeiri.courses.didemo.app.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
/*
* The default behaviour (no specification of ComponentScan) of ComponentScan is top-down scan of com.kejeiri.courses.didemo package
* since Service is outside that package we get a not found service error, we need explicitly override the default behaviour
* and add all package that need to be scanned.!!!
* */
@ComponentScan(basePackages = {"com.kejeiri.courses.services","com.kejeiri.courses.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        //the instance of MyController will be myController created a startup by spring.
        MyController myController = (MyController)ctx.getBean("myController");
        System.out.println(myController.hello());
        System.out.println(ctx.getBean(MyController.class).hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }
}
