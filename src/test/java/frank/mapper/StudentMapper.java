package frank.mapper;

import frank.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.example.base.BaseMapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}