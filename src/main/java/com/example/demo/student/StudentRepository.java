package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository // Repository, because this interface is responsible for database data access.
public interface StudentRepository extends JpaRepository<Student, Long> {

}
