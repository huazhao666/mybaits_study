package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.Article;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-01-21
 * Time : 15:33
 */
@Mapper
@Component //可有可无
public interface ArticleMapper {
    int updateById(Article article);

    int deleteByUsername(String username);
    List<Article> selectAll(@Param("column")String column, @Param("orderBy")String orderBy);

    List<Article> selectLike(@Param("title") String title,
                             @Param("content") String content, @Param("orderBy") String orderBy);


}
