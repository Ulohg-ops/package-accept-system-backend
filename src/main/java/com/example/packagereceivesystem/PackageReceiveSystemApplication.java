package com.example.packagereceivesystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class PackageReceiveSystemApplication implements CommandLineRunner {


    private static final Logger log = LoggerFactory.getLogger(PackageReceiveSystemApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PackageReceiveSystemApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
//        studentDao.saveStudent(new Student(4l,"casd","asdasd","sadasd"));
//        studentDao.findAllStudent();
    }

}
