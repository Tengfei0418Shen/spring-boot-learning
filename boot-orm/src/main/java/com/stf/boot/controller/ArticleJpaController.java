package com.stf.boot.controller;


import com.stf.boot.common.AjaxResponse;
import com.stf.boot.entity.Article;
import com.stf.boot.service.impl.ArticleJpaServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@CrossOrigin( maxAge = 3600)
@RestController
@RequestMapping(value = "/api/v1/articles")
public class ArticleJpaController {
    @Resource
    private ArticleJpaServiceImpl articleJpaService;

    @GetMapping(value = "/all")
    public AjaxResponse selectAll() {
        AjaxResponse success = AjaxResponse.success(articleJpaService.selectAll());
        return success;
    }

    @PostMapping()
    public AjaxResponse addArticle(@RequestBody Article article) {
        return AjaxResponse.success(articleJpaService.saveArticle(article));
    }

    @PutMapping()
    public AjaxResponse updateArticle(@RequestBody Article article) {
        if (articleJpaService.saveArticle(article) != null) {
            return AjaxResponse.success("修改成功");
        } else {
            return AjaxResponse.failure();
        }
    }

    @GetMapping("{id}")
    public AjaxResponse findById(@PathVariable int id) {
        return AjaxResponse.success(articleJpaService.findById(id));
    }
}
