package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.StudentDaoImpl;
import com.example.demo.model.Student;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class StudentController {

    private StudentDao studentDao;

    @GetMapping("/hello")
    public String hello () {
        log.info("hello");
        return "hello";
    }

    public Student findByid ( int id) {
        var student = getStudentDao().findById (id);
        // ... other logic .... to manipulate student object
        return student;
    }

    public void setStudentDao (StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentDao getStudentDao() {
        if (studentDao == null) {
            studentDao = new StudentDaoImpl();
        }
        return studentDao;
    }

}
