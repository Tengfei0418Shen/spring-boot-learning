package com.stf.boot.dao;

import com.stf.boot.entity.Article;
import com.stf.boot.service.impl.ArticleJpaServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleDaoTest {

    @Resource
    private ArticleJpaServiceImpl a;

    @Test
    void findAll() {
        System.out.println(a.selectAll());
    }
}