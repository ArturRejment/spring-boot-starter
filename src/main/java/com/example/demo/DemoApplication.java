package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController // This annotation makes class a RESTFull, to serve REST endpoints
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
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
