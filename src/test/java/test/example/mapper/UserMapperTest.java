package test.example.mapper;

import org.example.Application;
import org.example.mapper.UserMapper;
import org.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//指定为Spring环境中的单元测试
@RunWith(SpringRunner.class)
//指定为SpringBoot环境的单元测试，Application为启动类
@SpringBootTest(classes = Application.class)
//使用事务，在SpringBoot的单元测试中会自动回滚
@Transactional

public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void  selectById(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void selectCondition(){
        List<User>  users = userMapper.selectByCondition(
                "%",null,4); // xml里面配置了， 可以三个任意空一个
        System.out.println(users);
    }
    @Test
    public void selectCondition2(){
        List<User> users = userMapper.selectByCondition2(
                "a%");
        System.out.println(users);
    }
    @Test
    public void selectCondition3(){
        User user = new User();
        user.setUsername("a%");
        List<User>  users = userMapper.selectByCondition3(user);
        System.out.println(users);
    }
    @Test
    public void insert(){
        User user = new User();
        user.setUsername("斗战胜佛");
        user.setPassword("紧箍咒");
        user.setSex(true);
        int n = userMapper.insert(user);
        System.out.println(user);
    }
    //
    @Test
    public void insert2(){
        User user = new User();
        user.setUsername("d");
        user.setPassword("4");
        user.setNickname("滴滴");
       /* DateFormat format = new SimpleDateFormat();
        Date date = new Date();*/
        user.setBirthday(new Date());
        int n = userMapper.insert(user);

    }
    @Test
    public void selectAll(){
        List<User> users = userMapper.selectAll();
        users.forEach(System.out:: println);
    }
    @Test
    public void batchDelete(){ //这里不能删除id，因为有外键约束
        List<Integer> ids = new ArrayList<>();
        ids.add(11);
        ids.add(12);
        userMapper.batchDelete(ids);
    }

    @Test
    public void batchInsert(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUsername("xx");
        user1.setPassword("123");
        user1.setSex(true);
        user1.setBirthday(new Date());
        user1.setHead("http:xxx.com/heda");
        User user2 = new User();
        user2.setUsername("zz");
        user2.setPassword("456");
        user2.setSex(true);
        user2.setBirthday(new Date());
        user2.setHead("http:zzz.com/heda");
        users.add(user1);
        users.add(user2);
        userMapper.batchInsert(users);
    }
}
