package com.student.ust.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "books_ust_details_identitymappedbytest")
public class Books {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int bookId;

    private String bookName;

    private int year;
    private int price;
    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;

}



