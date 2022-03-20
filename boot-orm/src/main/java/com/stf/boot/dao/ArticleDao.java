package com.stf.boot.dao;

import com.stf.boot.entity.Article;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-18 08:44:16
 **/

@Repository
public class ArticleDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Transactional(rollbackFor = {Exception.class})
    /**
     *
     * @param article 入参
     */
    public int save(Article article) {
        String sql = "INSERT INTO article (author,title,content) VALUES (?,?,?)";
        return jdbcTemplate.update(sql, article.getAuthor(), article.getTitle(), article.getContent());
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM article WHERE id = ?", id);
    }

    public int updateById(Article article) {
        String sql = "UPDATE article SET author = ?, title = ?, content = ?, create_time = ?, WHERE id = ?";
        return jdbcTemplate.update(sql, article.getAuthor(), article.getTitle(), article.getContent(), article.getCreateTime());
    }

    public Article findById(int id) {
        String sql = "SELECT * FROM article WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Article.class), id);
    }

    public List<Article> findAll() {
        String sql = "SELECT * FROM article";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Article.class));
    }

}
