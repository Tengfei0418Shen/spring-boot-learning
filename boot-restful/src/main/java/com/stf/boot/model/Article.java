package com.stf.boot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @program: boot-learning
 * @description: Article 资源
 * @author: ShenTF
 * @create: 2022-03-10 16:27:26
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder(value={"content","title"})
public class Article {

//    @JsonIgnore
    private Long id;

//    @JsonProperty("writer")
    private String author;
    private String content;
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    private Date updateTime;
    private List<Reader> readerList;
}
