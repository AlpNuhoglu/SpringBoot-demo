package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentID}")
    public void deleteStudent(@PathVariable("studentID") Long studentID) {
        studentService.deleteStudent(studentID);
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @PutMapping(path = "{studentID}")
    public void updateStudent(
            @PathVariable("studentID") Long studentID,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        LOGGER.info("Updating student with ID: {}, Name: {}, Email: {}", studentID, name, email);
        studentService.updateStudent(studentID, name, email);
    }


}

