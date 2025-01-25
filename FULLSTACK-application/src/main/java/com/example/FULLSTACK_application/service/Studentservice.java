package com.example.FULLSTACK_application.service;

import com.example.FULLSTACK_application.model.Student;
import java.util.List;

public interface Studentservice {

    List<Student> getStudentsByEnrollmentYear(int yearOfEnrollment);

    void deleteStudentsByYearOfEnrollment(int yearOfEnrollment);
}
