package com.student.ust.entity;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name ="student_ustbatch_identitymappedbytest")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int studentId;
    //@Coloumn(name="student_firstname",length=50;
    private String name;

    private int age;
    private int rollno;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;


    @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY,mappedBy = "student")
    private Set<Books> booksSet;
}
