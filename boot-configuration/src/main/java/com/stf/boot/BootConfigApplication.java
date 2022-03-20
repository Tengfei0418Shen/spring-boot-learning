package com.stf.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-14 11:13:29
 **/
@Slf4j
@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml","classpath:beans1.xml"})
public class BootConfigApplication {
    public static void main(String[] args) {
        log.info("服务启动成功");
        SpringApplication.run(BootConfigApplication.class);
    }
}
