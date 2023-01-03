package com.example.packagereceivesystem.service;

import com.example.packagereceivesystem.exception.StudentNotFoundException;
import com.example.packagereceivesystem.model.Student;
import com.example.packagereceivesystem.repisitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Long id) {
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
    public void deleteStudent(Long id){
        if(!studentRepository.existsById(id)){
            throw new StudentNotFoundException(id);
        }
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id,Student newStudent){
        studentRepository.deleteById(id);
        return studentRepository.save(newStudent);
        //      return  studentRepository.findById(id)
//                .map(user -> {
//                    user.setId(newStudent.getId());
//                    user.setDepartment(newStudent.getDepartment());
//                    user.setName(newStudent.getName());
//                    user.setEmail(newStudent.getEmail());
//                    return studentRepository.save(user);
//                }).orElseThrow(() -> new StudentNotFoundException(id));
    }

}
