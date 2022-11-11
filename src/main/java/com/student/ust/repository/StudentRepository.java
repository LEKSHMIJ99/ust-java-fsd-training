package com.student.ust.repository;
//import com.cts.ctssb.entity.student;
import com.student.ust.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.Optional;


@Repository
public interface StudentRepository extends
        JpaRepository<Student,Integer>{

    Student findByName(String n);
}
