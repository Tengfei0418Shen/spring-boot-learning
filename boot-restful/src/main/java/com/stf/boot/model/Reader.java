package com.stf.boot.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-10 19:03:25
 **/

@Data
@Builder
public class Reader implements Serializable {


    @Serial
    private static final long serialVersionUID = -6904480891927248332L;
    private String name;
    private Integer age;


}
