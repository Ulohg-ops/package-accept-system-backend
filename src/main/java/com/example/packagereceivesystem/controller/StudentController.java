package com.example.packagereceivesystem.controller;

import com.example.packagereceivesystem.model.Student;
import com.example.packagereceivesystem.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("http://127.0.0.1:3000/")
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @GetMapping("/getAll")
    public List<Student> list(){
        return studentDao.findAllStudent();
    }


    @PostMapping("/add")
    public String add(@RequestBody Student student){
        return studentDao.saveStudent(student);
    }

    @GetMapping("/{id}")
    Student getStudentByID(@PathVariable Long id){
      return studentDao.fillStudentByID(id);
    }

    @PutMapping("/{id}")
    void updateStudent(@RequestBody Student student,@PathVariable Long id){
        studentDao.updateStudent(student,id);

    }

    @DeleteMapping("/{id}")
    void deleteStudent(@PathVariable Long id){
        studentDao.deleteStudent(id);

    }
}
