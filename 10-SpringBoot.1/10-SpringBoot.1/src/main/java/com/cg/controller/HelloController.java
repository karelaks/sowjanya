package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class HelloController {
	@GetMapping("/hello")
  public String greetMe() {
	  System.out.println("Hello!! I am Spring Controller");
	  return "hello";
  }
}
