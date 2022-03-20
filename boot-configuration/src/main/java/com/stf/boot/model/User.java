package com.stf.boot.model;

import com.stf.boot.config.MixPropertiesSourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-14 14:14:20
 **/

@Data
@Component
@ConfigurationProperties(prefix="user")
@PropertySource(value = {"classpath:user.yml"}, factory = MixPropertiesSourceFactory.class)
//@Validated
public class User {

    private String name;

    private Integer age;
    @Valid
    private Book book;
}
