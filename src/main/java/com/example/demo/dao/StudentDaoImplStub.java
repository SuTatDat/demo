package com.example.demo.dao;

import com.example.demo.model.Student;

import java.util.List;

import static java.util.Arrays.asList;


public class StudentDaoImplStub implements StudentDao {

    @Override
    public Student findById(int id) {
        return new Student(1, "A", 1);
    }

}
