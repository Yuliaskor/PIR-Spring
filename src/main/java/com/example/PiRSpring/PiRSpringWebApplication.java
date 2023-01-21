package com.example.PiRSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PiRSpringWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PiRSpringWebApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(
                             ) {
        return args -> {
        };

    }

}
