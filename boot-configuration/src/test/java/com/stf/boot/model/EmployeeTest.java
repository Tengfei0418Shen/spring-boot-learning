package com.stf.boot.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)  //JUnit5
class EmployeeTest {
    @Resource
    private Employee employee;

    @Test
    void getEmployee(){
        log.info(String.valueOf(employee));
//        System.out.println(employee);
        Map<String, Integer> age = employee.getAge();
        for (String key:age.keySet()){
            System.out.println(key+age.get(key));
        }
        age.forEach((key,value)-> System.out.println(key+ "->" + value));
    }

}