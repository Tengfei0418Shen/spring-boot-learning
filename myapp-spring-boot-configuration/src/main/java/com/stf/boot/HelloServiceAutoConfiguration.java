package com.stf.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-09 09:01:19
 **/
@ConditionalOnWebApplication

@EnableConfigurationProperties(HelloProperties.class)
@Configuration
public class HelloServiceAutoConfiguration {
    @Autowired
    private HelloProperties helloProperties;
    @Bean
    public HelloService helloService(){
        HelloService helloService =new HelloService();
        helloService.setHelloProperties(helloProperties);
        return  helloService;
    }
}
