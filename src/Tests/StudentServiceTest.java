package com.smartcampus.services;

import com.smartcampus.model.Student;
import com.smartcampus.repositories.inmemory
        .InMemoryStudentRepository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test
    public void testAddStudent() {

        StudentService service =
                new StudentService(
                        new InMemoryStudentRepository());

        Student student =
                new Student(
                        "S1",
                        "Lucky",
                        "mail@test.com");

        service.addStudent(student);

        assertEquals(
                "S1",
                student.getStudentId());
    }
}