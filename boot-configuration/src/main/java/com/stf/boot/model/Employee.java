package com.stf.boot.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @program: boot-learning
 * @description: @Configuration本类时一个配置类
 * @author: ShenTF
 * @create: 2022-03-14 15:40:08
 **/
@Data
@Configuration
@PropertySource(name="", value = "classpath:employee.properties")
public class Employee {
    /**
     * 使用SpEL 读取 employee
     */
    @Value("#{'${employee.names}'.split(',')}")
    private List<String> employeeNames;
    @Value("#{'${employee.type}'.split(',')}")
    private List<String> type;
    @Value("#{${employee.age}}")
    private Map<String,Integer> age;

    @Value("#{${employee.age}['four'] == null?10:${employee.age}['four']}")
    private Integer ageWithDefaultValue;

    @Value("#{systemProperties['java.home']}")
    private String javaHome;

    @Value("#{systemProperties['user.dir']}")
    private String userDir;
}
