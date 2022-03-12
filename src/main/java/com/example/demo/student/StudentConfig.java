package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student artur = new Student(
                    "Artur",
                    LocalDate.of(2000, Month.NOVEMBER, 5),
                    21,
                    "artur@gmail.com"
            );

            Student marcin = new Student(
                    "Marcin",
                    LocalDate.of(1990, Month.NOVEMBER, 5),
                    31,
                    "marcin@gmail.com"
            );

            List<Student> listOfStudents = new ArrayList<>();
            listOfStudents.add(artur);
            listOfStudents.add(marcin);

            repository.saveAll(listOfStudents);
        };
    }
}
