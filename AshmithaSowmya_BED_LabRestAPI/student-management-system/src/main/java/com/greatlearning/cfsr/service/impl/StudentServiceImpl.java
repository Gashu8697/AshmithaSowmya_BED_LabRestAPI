package com.greatlearning.cfsr.service.impl;

import java.util.List;

import javax.print.StreamPrintService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.cfsr.entity.Student;
import com.greatlearning.cfsr.repository.StudentRepository;
import com.greatlearning.cfsr.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    //@Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }


    @Override
    public Student updateStudent(Long id, Student student) {
        Student existingStudent = getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        studentRepository.save(existingStudent);
        return existingStudent;
    }


    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id); 
    }
    
}
