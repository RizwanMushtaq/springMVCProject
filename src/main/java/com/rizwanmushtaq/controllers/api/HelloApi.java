package com.rizwanmushtaq.controllers.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
//@Controller
//@RequestMapping("/api")
//public class HelloApi {
//  @RequestMapping("/hello")
//  @ResponseBody
//  public String hello() {
//    System.out.println("Processing request for /api/hello");
//    return "Hello from API!";
//  }
//
//  @RequestMapping("/users")
//  @ResponseBody
//  public List<String> getUsers() {
//    System.out.println("Fetching users from API");
//    return Arrays.asList("User1", "User2", "User3");
//  }
//}

// Another way to write above code:
@RestController
// This annotation combines @Controller and @ResponseBody, so no need to use @ResponseBody on each method
@RequestMapping("/api")
public class HelloApi {
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello() {
    System.out.println("Processing request for /api/hello");
    return "Hello from API!";
  }

  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public List<String> getUsers() {
    System.out.println("Fetching users from API");
    return Arrays.asList("User1", "User2", "User3");
  }

  @RequestMapping(value = "/createUser", method = RequestMethod.POST)
  public String createUser(String user) {
    System.out.println("Creating user: " + user);
    return "User created: " + user;
  }
}