package com.example.FULLSTACK_application.service;

import com.example.FULLSTACK_application.model.Student;
import java.util.List;
import java.util.Optional;

public interface Studentservice {

    List<Student> getStudentsByEnrollmentYear(int yearOfEnrollment);

    List<Student> getStudentsByDepartment(String department);

    Optional<String> findDepartmentById(Long id);

    Optional<String> getDepartmentByStudentId(Long id);

}
