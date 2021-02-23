package frank.mapper;

import frank.model.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.example.base.BaseMapper;

@Mapper
public interface EmpMapper extends BaseMapper<Emp> {
}