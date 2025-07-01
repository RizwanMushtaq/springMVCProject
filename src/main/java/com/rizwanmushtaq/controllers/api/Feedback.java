package com.rizwanmushtaq.controllers.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Feedback {
  @GetMapping("/feedbacks")
  public List<String> getFeedbacks() {
    System.out.println("Fetching feedbacks from API");
    return Arrays.asList("Feedback1", "Feedback2", "Feedback3");
  }

  @PostMapping("/createFeedback")
  public String createFeedback(String feedback) {
    System.out.println("Creating feedback: " + feedback);
    return "Feedback created: " + feedback;
  }
}
