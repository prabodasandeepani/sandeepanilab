package com.example.FULLSTACK_application.repository;

import com.example.FULLSTACK_application.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface Studentrepository extends MongoRepository<Student, String> {

    // Custom query to find students by year of enrollment
    List<Student> findByYearOfEnrollment(int yearOfEnrollment);

    // Custom query to find students by department
    List<Student> findByDepartment(String department);
}
