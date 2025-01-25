package com.example.FULLSTACK_application.service.impl;

import com.example.FULLSTACK_application.model.Student;
import com.example.FULLSTACK_application.repository.Studentrepository;
import com.example.FULLSTACK_application.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Studentserviceimpl implements Studentservice {

    @Autowired
    private Studentrepository studentRepository;

    // Method to get students by year of enrollment
    @Override
    public List<Student> getStudentsByEnrollmentYear(int yearOfEnrollment) {
        return studentRepository.findByYearOfEnrollment(yearOfEnrollment);
    }

    // Method to get students by department
    @Override
    public List<Student> getStudentsByDepartment(String department) {
        return studentRepository.findByDepartment(department);
    }

    @Override
    public Optional<String> getDepartmentByStudentId(Long studentId) {
        return studentRepository.findDepartmentById(studentId);
    }

    @Override
    public Optional<String> findDepartmentById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findDepartmentById'");
    }

}
