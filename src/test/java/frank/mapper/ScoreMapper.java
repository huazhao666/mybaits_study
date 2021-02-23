package frank.mapper;

import frank.model.Score;
import org.apache.ibatis.annotations.Mapper;
import org.example.base.BaseMapper;

@Mapper
public interface ScoreMapper extends BaseMapper<Score> {
}