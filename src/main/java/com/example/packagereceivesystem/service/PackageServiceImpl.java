package com.example.packagereceivesystem.service;

import com.example.packagereceivesystem.exception.StudentNotFoundException;
import com.example.packagereceivesystem.model.Package;
import com.example.packagereceivesystem.model.Student;
import com.example.packagereceivesystem.repisitory.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageServiceImpl {
    @Autowired
    PackageRepository packageRepostitory;

    public Package addPackage(Package myPackage){
        return packageRepostitory.save(myPackage);
    }

    public List<Package> getAllPackages() {
        return packageRepostitory.findAll();
    }
    public void deletePackage(String id){
//        if(!packageRepostitory.existsById(id)){
//            throw new StudentNotFoundException(id);
//        }
        packageRepostitory.deleteById(id);
    }

}
