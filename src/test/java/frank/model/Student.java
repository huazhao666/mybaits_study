package frank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    
    private Integer id;

    private Integer sn;

    private String name;

    private String qqMail;

    private Integer classesId;
}