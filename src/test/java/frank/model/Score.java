package frank.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Score {
    
    private Integer id;

    private BigDecimal score;

    private Integer studentId;

    private Integer courseId;
}