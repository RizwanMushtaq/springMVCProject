package com.rizwanmushtaq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class Admin {
  @RequestMapping("/login")
  public String login() {
    System.out.println("Processing request for /admin/login");
    return "adminLogin";
  }

  @RequestMapping("/dashboard")
  public String dashboard() {
    System.out.println("Processing request for /admin/dashboard");
    return "adminDashboard";
  }
}
