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
    void test_findStudentByIdEq1() {
        studentController = new StudentController();
        studentController.setStudentDao(new StudentDaoImplStub());
        var student = studentController.findByid(1);
        Assertions.assertNotNull(student);
        Assertions.assertEquals(student.getId(), 1);
    }
}



