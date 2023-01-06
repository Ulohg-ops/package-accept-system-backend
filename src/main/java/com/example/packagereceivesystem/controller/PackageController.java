package com.example.packagereceivesystem.controller;

import com.example.packagereceivesystem.exception.StudentNotFoundException;
import com.example.packagereceivesystem.model.Package;
import com.example.packagereceivesystem.model.Student;
import com.example.packagereceivesystem.service.PackageServiceImpl;
import com.example.packagereceivesystem.service.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/package")
public class PackageController {
    private static final Logger log = LoggerFactory.getLogger(PackageController.class);

    @Autowired
    private PackageServiceImpl packageService;
//
    @PostMapping("/add")
    ResponseEntity<String> newStudent(@RequestBody Package myPackage) {
         packageService.addPackage(myPackage);
        return ResponseEntity.ok("Student is add successful");
    }
    @GetMapping("/getAll")
    public List<Package> list(){
        return packageService.getAllPackages();
    }
}


