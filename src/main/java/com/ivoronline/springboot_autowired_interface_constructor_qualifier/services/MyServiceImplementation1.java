package com.ivoronline.springboot_autowired_interface_constructor_qualifier.services;

import org.springframework.stereotype.Service;

@Service("impl1")
public class MyServiceImplementation1 implements MyServiceInterface {

  //=======================================================================
  // SAY HELLO
  //=======================================================================
  public String sayHello() {
    return "Hello";
  }

}
