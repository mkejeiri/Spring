package com.kejeiri.courses.beanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanlifecycleApplication {

    public static void main(String[] args)
    {
       ApplicationContext  ctx =  SpringApplication.run(BeanlifecycleApplication.class, args);

    }
}
