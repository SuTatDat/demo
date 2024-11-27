package controller;

import com.example.demo.controller.StudentController;
import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;


public class StudentControllerTest {

    @Mock
    private StudentDao mockStudentDao;

    @Test
    void test_findStudentByIdEq1 () {
        mockStudentDao = Mockito.mock(StudentDao.class);
        var mockStudent = new Student(1, "A", 1);
        var studentController = new StudentController();

        when(mockStudentDao.findById(1)).thenReturn(mockStudent);
        studentController.setStudentDao(mockStudentDao);

        var student = studentController.findByid(1);
        Assertions.assertNotNull(student);
        Assertions.assertEquals(student.getId(),1);
    }
}
