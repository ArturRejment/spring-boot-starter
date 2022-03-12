package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


@Service // Just like @Component, but more specific. Allows this class to be Autowired.
public class StudentService {

    public List<Student> getStudents(){
        List<Student> listOfStudents = new ArrayList<>();

        Student student1 = new Student(
                1L,
                "Artur",
                LocalDate.of(2000, Month.NOVEMBER, 5),
                21,
                "artur@gmail.com"
        );

        listOfStudents.add(student1);
        return listOfStudents;
    }
}
