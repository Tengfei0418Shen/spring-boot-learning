package com.stf.boot.entity;

import com.stf.boot.listener.DataBaseAuditListener;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-18 08:42:43
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EntityListeners({DataBaseAuditListener.class})
public class Article implements Serializable {
    @Serial
    private static final long serialVersionUID = -3317203987154803161L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;

    private String title;

    private String thumbnail;

    private String content;

    @Column(name = "create_time", updatable = false)
    private Date createTime;

    private Date updateTime;

}
