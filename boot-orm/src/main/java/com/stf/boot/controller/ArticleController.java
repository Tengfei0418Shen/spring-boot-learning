package com.stf.boot.controller;


import com.stf.boot.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
//@RequestMapping(value = "/api/v1/articles")
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

//    @GetMapping(value = "/all")
//    public List<Article> selectAll() {
//        return articleService.selectAll();
//    }
}
