package com.stf.boot;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-09 08:51:45
 **/

@ConfigurationProperties(prefix = "myapp.hello")
public class HelloProperties {
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    private String suffix;
    public  String getSuffix(){
        return suffix;
    }
}
