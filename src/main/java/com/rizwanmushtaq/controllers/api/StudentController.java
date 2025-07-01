package com.rizwanmushtaq.controllers.api;

import com.rizwanmushtaq.models.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
  /*
   * This method is used to create a new student.
   * It accepts a JSON object representing the student details.
   * json ---> java object ==> deserialization
   *
   */
  @PostMapping("/create")
  public String createStudent(@RequestBody Student student) {
    System.out.println(student);
    return "Student created successfully: " + student.toString();
  }
}
