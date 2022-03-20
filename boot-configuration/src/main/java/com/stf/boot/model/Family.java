package com.stf.boot.model;

import com.stf.boot.config.MixPropertiesSourceFactory;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @program: boot-learning
 * @description: 无比注意 成员变量名 yaml配置项名称一一对应
 * @author: ShenTF
 * @create: 2022-03-14 11:09:16
 **/

@Data
@Component
@Validated
/**
 * 配置整体前缀
 */
//@ConfigurationProperties(prefix="family")
//@PropertySource(value = {"classpath:family.yml"}, factory = MixPropertiesSourceFactory.class)

public class Family {
    private Father father;
    private Child child;
    private Mother mother;
    private String familyName;
}
