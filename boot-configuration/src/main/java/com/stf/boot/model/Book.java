package com.stf.boot.model;

import lombok.Data;

import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-14 14:14:59
 **/

@Data
public class Book {
    private String name;
    private String author;
    @Past(message = "该日期不正常")
    private Date create;
}
