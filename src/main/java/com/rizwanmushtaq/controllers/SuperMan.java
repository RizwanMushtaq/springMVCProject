package com.rizwanmushtaq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperMan {
  @RequestMapping("/")
  public String home() {
    System.out.println("Processing request for /");
    return "home";
  }

  @RequestMapping("/about")
  public String about() {
    System.out.println("Processing request for /about");
    return "about";
  }
}
