package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-01-21
 * Time : 15:31
 */
@Getter
@Setter
@ToString
public class Article {

    private Integer id;
    private String title;
    private String content;
    private Integer viewCount;
    private Integer userId;
    private Date createTime;
    private User user;

}
