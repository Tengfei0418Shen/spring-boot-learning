package com.stf.boot.service.impl;


import com.stf.boot.dao.ArticleRepository;
import com.stf.boot.entity.Article;
import com.stf.boot.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;


@Service
public class ArticleJpaServiceImpl implements ArticleService {

    @Resource
    private ArticleRepository articleRepository;

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void deleteById(int id) {
        articleRepository.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void updateArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public List<Article> selectAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article findById(int id) {
        Optional<Article> optional = articleRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public List<Article> findByAuthor(String author) {
        return articleRepository.findByAuthor(author);
    }
}
