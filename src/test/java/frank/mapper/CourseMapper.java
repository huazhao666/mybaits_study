package frank.mapper;

import frank.model.Course;
import org.apache.ibatis.annotations.Mapper;
import org.example.base.BaseMapper;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {
}