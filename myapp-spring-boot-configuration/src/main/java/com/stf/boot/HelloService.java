package com.stf.boot;

import org.springframework.stereotype.Controller;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-09 08:48:44
 **/

@Controller
public class HelloService {
    HelloProperties helloProperties;
    public String sayHello(String name){
        return "Hello" + name+","+helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties(){
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
