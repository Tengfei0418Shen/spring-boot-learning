package com.stf.boot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.Past;
import java.util.Date;
import java.util.List;

/**
 * @program: boot-learning
 * @description: 孩子有名字和年龄还有朋友们
 * @author: ShenTF
 * @create: 2022-03-14 11:06:35
 **/

@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
//    @Past(message = "该日期绝对有问题")
//    @JsonFormat(timezone = "YYYY-mm-dd")
//    private Date birth;
}
