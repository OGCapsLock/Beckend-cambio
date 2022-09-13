package com.teste.springbootteste;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController(){

  @RequestMapping("/Hello")
  public String Hello(){
    return "Hello";
  }
}

