package com.example.demo.repository;
import com.example.demo.model.Student;
import java.util.List;
import static java.util.Arrays.asList;

public class StudentRepository {
    private static final List<Student> dummyStudents = asList(
            new Student(1, "A", 1),
            new Student(2, "B", 2)
    );

    public Student findById(int id) {
        return dummyStudents.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }
}
