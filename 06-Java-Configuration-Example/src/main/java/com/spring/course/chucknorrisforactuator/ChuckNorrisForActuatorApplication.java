package com.spring.course.chucknorrisforactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.course.chucknorrisforactuator","external.config"})
public class ChuckNorrisForActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuckNorrisForActuatorApplication.class, args);
    }
}
