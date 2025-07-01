package com.rizwanmushtaq.controllers.api;

import com.rizwanmushtaq.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
  @GetMapping("/students")
  public List<Student> getStudents() {
    System.out.println("Fetching students from API");
    return List.of(
        new Student(), new Student(), new Student(), new Student(), new Student()
    );
  }

  /*
   * This method is used to create a new student.
   * It accepts a JSON object representing the student details.
   * json ---> java object ==> deserialization
   * At return, it converts the java object back to JSON ==> serialization
   * This serialization and deserialization is handled by Jackson library
   *
   */
  @PostMapping("/create")
  public ResponseEntity createStudent(@RequestBody Student student) {
    System.out.println(student);
    ResponseEntity<Student> responseEntity = new ResponseEntity<>(student,
        HttpStatus.CREATED);
    return responseEntity;
  }
}
