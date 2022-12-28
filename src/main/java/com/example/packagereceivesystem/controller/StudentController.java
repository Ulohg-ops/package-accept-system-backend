package com.example.packagereceivesystem.controller;

import com.example.packagereceivesystem.model.Student;
import com.example.packagereceivesystem.repository.StudentDao;
import com.example.packagereceivesystem.service.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin("http://127.0.0.1:3000/")
@RequestMapping("/student")
public class StudentController {
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);


    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.getAllStudents();
    }
}


