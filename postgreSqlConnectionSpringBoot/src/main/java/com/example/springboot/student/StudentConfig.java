package com.example.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

                   Student mertcan =  new Student(
                            1L,
                            "Mertcan",
                            "mertcantest@gmail.com",
                            LocalDate.of(1999 , APRIL , 10) ,
                           23
            );

            Student peterParker =  new Student(
                    2L,
                    "Peter Parker",
                    "spiderman@gmail.com",
                    LocalDate.of(1990 , JANUARY , 25) ,
                    32
            );
            repository.saveAll(
                    List.of(mertcan , peterParker));
        };
    }
}
