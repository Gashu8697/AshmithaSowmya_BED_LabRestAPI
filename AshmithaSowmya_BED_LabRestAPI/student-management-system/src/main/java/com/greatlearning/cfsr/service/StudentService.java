package com.greatlearning.cfsr.service;

import java.util.List;

import com.greatlearning.cfsr.entity.Student;

public interface StudentService {
    List<Student> getAllStudents(); 
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
