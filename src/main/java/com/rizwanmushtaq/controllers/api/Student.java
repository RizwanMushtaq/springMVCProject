package com.rizwanmushtaq.controllers.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/api")
public class Student {
  @GetMapping("/students")
  public List<Student> getAllStudents() {
    List<Student> students = new ArrayList<>();
    students.add(new Student());
    students.add(new Student());
    return students;
  }

  @PostMapping("/student")
  public Student createStudent(@RequestBody Student student) {
    // Logic to save the new student
    return student;
  }
}
