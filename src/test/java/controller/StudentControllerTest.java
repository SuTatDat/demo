package controller;

import com.example.demo.controller.StudentController;
import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;


public class StudentControllerTest {

    @Test
    void test_findStudentByIdEq1 () {
        var studentController = new StudentController();
        StudentDao mockStudentDao = Mockito.mock(StudentDao.class);
        Student mockStudent = new Student(1, "A", 1);
        when(mockStudentDao.findById(1)).thenReturn(mockStudent);
        studentController.setStudentDao(mockStudentDao);
        var student = studentController.findByid(1);
        Assertions.assertNotNull(student);
        Assertions.assertEquals(student.getId(),1);
    }
}
