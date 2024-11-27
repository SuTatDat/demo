package controller;

import com.example.demo.controller.StudentController;
import com.example.demo.dao.StudentDao;
import com.example.demo.dao.StudentDaoImplStub;
import com.example.demo.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;


public class StudentControllerTest {

    private StudentController studentController;

    @Test
    void test_findStudentByIdEq1 () {
        studentController = new StudentController();
        StudentDao mockStudentDao = Mockito.mock(StudentDao.class);
        Student mockStudent = new Student(1, "A", 1);
        when(mockStudentDao.findById(1)).thenReturn(mockStudent);
        studentController.setStudentDao(mockStudentDao);
        var student = studentController.findByid(1);
        Assertions.assertNotNull(student);
        Assertions.assertEquals(student.getId(),1);
    }


    @Test
    void test_findStudentByIdEq2 () {
        studentController = new StudentController();
        var verifyStudent = new Student(2, "B", 2);
        var actualStudent = studentController.findByid(verifyStudent.getId());
        Assertions.assertNotNull(verifyStudent);
        Assertions.assertEquals(actualStudent.getId(),2);
    }
}
