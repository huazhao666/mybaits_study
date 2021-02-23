package frank.mapper;

import frank.model.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.example.base.BaseMapper;

@Mapper
public interface TestUserMapper extends BaseMapper<TestUser> {
}