package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.StudentDaoImpl;
import com.example.demo.model.Student;

public class StudentController {

    private StudentDao studentDao;

    public Student findByid ( int id) {
        var student = getStudentDao().findById (id);
        // ... other logic .... to manipulate student object
        return student;
    }

    public StudentDao getStudentDao() {
        if (studentDao == null) {
            studentDao = new StudentDaoImpl();
        }
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
