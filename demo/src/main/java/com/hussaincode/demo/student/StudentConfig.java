package com.hussaincode.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student hussain = new Student(
                "Hussain",
                "hussaincode.in@gmail.com",
                LocalDate.of(1997,10,6)
            );

            Student mohammad = new Student(
                    "mohammad",
                    "techhroid.co.in@gmail.com",
                    LocalDate.of(1997,10,6)

            );

            repository.saveAll(
                    List.of(hussain,mohammad)
            );

        };
    }
}
