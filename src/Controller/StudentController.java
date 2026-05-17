package com.smartcampus.api;

import com.smartcampus.model.Student;
import com.smartcampus.services.StudentService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    public String createStudent(
            @RequestBody Student student) {

        service.addStudent(student);

        return "Student created successfully";
    }

    @GetMapping("/{id}")
    public Student getStudent(
            @PathVariable String id) {

        return service.getStudent(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(
            @PathVariable String id) {

        service.deleteStudent(id);

        return "Student deleted successfully";
    }
}