package frank.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Emp {
    
    private Integer id;

    private String name;

    private String role;

    private BigDecimal salary;
}