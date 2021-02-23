package test.example.mapper;

import org.example.Application;
import org.example.mapper.ArticleMapper;
import org.example.model.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-01-21
 * Time : 16:37
 */
//指定为Spring环境中的单元测试
@RunWith(SpringRunner.class)
//指定为SpringBoot环境的单元测试，Application为启动类
@SpringBootTest(classes = Application.class)
//使用事务，在SpringBoot的单元测试中会自动回滚
@Transactional

public class ArticleMapperTest {


    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void updateById(){
        Article article = new Article();
        article.setId(2);
        article.setTitle("面函数");
        article.setContent("public static void main(String[] args)");
        int n = articleMapper.updateById(article);
    }
    @Test
    public void deleteByUsername(){
        int n = articleMapper.deleteByUsername("c");
    }
    @Test
    public void selectAll(){
        List<Article> list = articleMapper.selectAll("id","desc");
        /*for(Article a : list){
            System.out.println(a);
        }
        */
        list.forEach(System.out::println);
    }
}
