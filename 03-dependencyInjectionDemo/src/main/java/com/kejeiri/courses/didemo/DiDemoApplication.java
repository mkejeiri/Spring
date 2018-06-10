package com.kejeiri.courses.didemo;

import com.kejeiri.courses.didemo.beancycle.CustomBeanPostProcessor;
import com.kejeiri.courses.didemo.controllers.ConstructorInjectedController;
import com.kejeiri.courses.didemo.controllers.MyController;
import com.kejeiri.courses.didemo.controllers.PropertyInjectedController;
import com.kejeiri.courses.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
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
