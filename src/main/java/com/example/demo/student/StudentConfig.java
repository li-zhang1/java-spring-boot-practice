package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student kate = new Student(
                    "Kate",
                    "kata@example.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student alex  = new Student(
                    "Alex",
                    "alex@example.com",
                    LocalDate.of(1998, JANUARY, 5)

            );

            studentRepository.saveAll(
                    List.of(kate, alex)
            );
        };

    }
}
