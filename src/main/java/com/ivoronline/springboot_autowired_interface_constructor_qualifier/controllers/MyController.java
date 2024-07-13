package com.ivoronline.springboot_autowired_interface_constructor_qualifier.controllers;

import com.ivoronline.springboot_autowired_interface_constructor_qualifier.services.MyServiceInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  MyServiceInterface myService;
  
  //=======================================================================
  // CONSTRUCTOR
  //=======================================================================
  //@Autowired
  public MyController(@Qualifier("impl1") MyServiceInterface myService) {
    System.out.println("MyController(MyServiceInterface myService)");
    this.myService = myService;
  }
  
  //=======================================================================
  // HELLO
  //=======================================================================
  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    String result = myService.sayHello();
    return result;
  }

}
