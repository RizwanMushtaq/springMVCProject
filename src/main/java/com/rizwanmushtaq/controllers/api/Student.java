package com.rizwanmushtaq.controllers.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Student {
  @GetMapping("/students")
  public List<Student> getAllStudents() {
    List<Student> students = new ArrayList<>();
    students.add(new Student());
    students.add(new Student());
    return students;
  }

  @PostMapping("/student")
  public String createStudent(Student student) {
    // Logic to save the new student
    return "Student created successfully: " + student.toString();
  }
}
