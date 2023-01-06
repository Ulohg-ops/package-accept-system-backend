//package com.example.packagereceivesystem.controller;
//
//import com.example.packagereceivesystem.exception.StudentNotFoundException;
//import com.example.packagereceivesystem.model.Student;
//import com.example.packagereceivesystem.service.StudentServiceImpl;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//
//@RestController
//@CrossOrigin("http://127.0.0.1:3000/")
//@RequestMapping("/student")
//public class StudentController {
//    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
//
//    @Autowired
//    private StudentServiceImpl studentService;
//
//    @GetMapping("/getAll")
//    public List<Student> list(){
//        return studentService.getAllStudents();
//    }
//    @GetMapping("/{id}")
//    public Student list(@PathVariable Long id){
//        return studentService.getStudent(id).orElseThrow(()->new StudentNotFoundException(id));
//    }
//    @PostMapping("/add")
//    ResponseEntity<String> newStudent(@RequestBody Student student) {
//         studentService.addStudent(student);
//        return ResponseEntity.ok("Student is add successful");
//    }
//
//    @DeleteMapping("/{id}")
//    ResponseEntity<String> deleteUser(@PathVariable Long id){
//         studentService.deleteStudent(id);
//        return ResponseEntity.ok("Student is deleted successful");
//
//    }
//    @PutMapping("/{id}")
//    ResponseEntity<String> updateStudent(@PathVariable Long id,@RequestBody Student student) {
//         studentService.updateStudent(id,student);
//         return ResponseEntity.ok("Student is updated successful");
//    }
//
//}
//
//
