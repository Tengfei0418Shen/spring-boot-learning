package com.stf.boot.controller;

import com.stf.boot.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-09 09:05:31
 **/
@RestController
public class HelloController {

        @Autowired
        HelloService helloService;
        @GetMapping("/hello")
        public String sayHello(String name){

            return  helloService.sayHello(name);
        }
}
