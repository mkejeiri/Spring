package com.spring.courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.courses","external.config"})
@ImportResource("classpath:chuck-config.xml")

public class ChuckNorrisForActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuckNorrisForActuatorApplication.class, args);
    }
}
