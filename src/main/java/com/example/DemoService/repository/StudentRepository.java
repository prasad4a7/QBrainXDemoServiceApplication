package com.example.DemoService.repository;

import com.example.DemoService.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    public List<Student> getStudentByName(String name);

    public List<Student> getStudentByClasss(String classs);

}
