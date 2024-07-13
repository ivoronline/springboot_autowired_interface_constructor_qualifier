package com.ivoronline.springboot_autowired_interface_constructor_qualifier.services;

import org.springframework.stereotype.Service;

@Service("impl2")
public class MyServiceImplementation2 implements MyServiceInterface {

  //=======================================================================
  // SAY HELLO
  //=======================================================================
  public String sayHello() {
    return "Hello 2";
  }

}
