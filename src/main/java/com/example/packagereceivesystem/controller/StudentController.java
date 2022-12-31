package com.example.packagereceivesystem.controller;

import com.example.packagereceivesystem.model.Student;
import com.example.packagereceivesystem.service.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/id")
    public Student list(Long id){
        return studentService.getStudent(id);
    }
    @PostMapping("/add")
    Student newStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    void deleteUser(@PathVariable Long id){
         studentService.deleteStudent(id);
    }
    @PutMapping("/{id}")
    Student updateStudent(@PathVariable Long id,@RequestBody Student student) {
        return studentService.updateStudent(id,student);
    }

}


