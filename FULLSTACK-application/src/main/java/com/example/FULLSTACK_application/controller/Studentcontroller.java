package com.example.FULLSTACK_application.controller;

import com.example.FULLSTACK_application.model.Student;
import com.example.FULLSTACK_application.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Studentcontroller {

    @Autowired
    private Studentservice studentService;

    // to get students by year of enrollment
    @GetMapping("/students/year/{year}")
    public List<Student> getStudentsByEnrollmentYear(@PathVariable int year) {
        return studentService.getStudentsByEnrollmentYear(year);
    }

    // to get students by department
    @GetMapping("/students/department/{department}")
    public List<Student> getStudentsByDepartment(@PathVariable String department) {
        return studentService.getStudentsByDepartment(department);
    }
}
