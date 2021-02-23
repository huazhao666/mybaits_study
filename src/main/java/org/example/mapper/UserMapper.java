package org.example.mapper;

import org.example.model.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-01-21
 * Time : 15:32
 */
@Mapper
@Component //可加可不加
public interface UserMapper  {

    User selectById(Integer id);

    //根据用户名模糊匹配,like '%悟%'，根据id,给定范围内的 2<= id <= 4

    List<User> selectByCondition(@Param("username")String username,
                                 @Param("sid") Integer sid,
                                 @Param("eid") Integer eid);

    List<User> selectByCondition2(String username);
    List<User> selectByCondition3(User user);

    int insert(User user);

    List<User> selectAll();

    int batchDelete(List<Integer> ids);

    int batchInsert(List<User> users);

}
