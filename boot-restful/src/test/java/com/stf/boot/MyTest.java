package com.stf.boot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stf.boot.model.Article;

import java.util.Date;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-10 19:46:22
 **/

public class MyTest {
    public static void main(String[] args) throws JsonProcessingException {
        Article a = Article.builder().id(11L).author("stf").title("Spring").content("hahaha").createTime(new Date()).build();
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(a);
        System.out.println("序列化:"+jsonStr);
        Article aa = mapper.readValue(jsonStr,Article.class);
        System.out.println("反序列化:"+aa.toString());
    }
}
