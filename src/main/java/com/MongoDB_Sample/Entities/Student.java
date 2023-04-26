package com.MongoDB_Sample.Entities;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document ( collation = "students")
@Setter
@Getter
@Data
public class Student {
    private int id ;
    private String name ;
    private String city ;
    private String college ;
}
