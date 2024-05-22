package com.example.DemoService.service;

import com.example.DemoService.entity.Student;
import com.example.DemoService.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        log.info("Save the record");
        return studentRepository.save(student);
    }


    public Student getStudentById(int id){
        log.info("Get the record with id : " + id);
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getStudentByName(String name){
        log.info("Get the record using  student name : {}",  name);
        return studentRepository.getStudentByName(name);
    }

    public List<Student> getStudentByClassName(String className){
        log.info("Get the record using  student class name : {}",  className);
        return studentRepository.getStudentByClasss(className);
    }


    public Student updateStudent(Student student) {
        log.info("Update the record with id : {} ", student.getId());
        return studentRepository.save(student);
    }

    public void deleteStudent(int id) {
        log.info("Delete the record with id : " + id);
        studentRepository.deleteById(id);
    }
}
