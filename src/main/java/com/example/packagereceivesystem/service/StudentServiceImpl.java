package com.example.packagereceivesystem.service;

import com.example.packagereceivesystem.model.Student;
import com.example.packagereceivesystem.repisitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class StudentServiceImpl {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id,Student newStudent){
        studentRepository.deleteById(id);
    return studentRepository.save(newStudent);
    }

}
