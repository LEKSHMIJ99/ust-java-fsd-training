package com.student.ust.service;
import
        com.student.ust.entity.Student;
import com.student.ust.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class StudentService {
    /**
     * The Student service.
     */
    @Autowired
    StudentRepository studentRepository;

    public Student getStudentByID(int id) {
        return studentRepository.findById(id).orElse(null);

    }

    public void saveStudent(Student student) {
        student.setCreateDate(LocalDateTime.now());
        student.setModifyDate(student.getCreateDate());
        studentRepository.save(student);
    }

    public List<Student> getStudentAll() {
        System.out.println((studentRepository.findByName("krithika")));
        return studentRepository.findAll();
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Student student) {
        Student updateStudent = studentRepository
                .findById(student.getStudentId()).orElseThrow(() -> new NoSuchElementException());
        updateStudent.setName(student.getName());
        updateStudent.setAge(student.getAge());
        updateStudent.setModifyDate(LocalDateTime.now());
        studentRepository.save(updateStudent);
        return updateStudent;
    }

}
