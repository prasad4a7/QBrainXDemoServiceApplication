package com.example.DemoService.controller;

import com.example.DemoService.entity.Student;
import com.example.DemoService.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/test")
    public Student saveStudentTest() {
        log.info("Inside saveStudent");
        return new Student(1,"Prasad","10061990",new Date(),"10th");
    }

    @PostMapping("/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        log.info("Inside saveStudent");
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        log.info("Inside updateStudent");
        return new ResponseEntity<>(studentService.updateStudent(student), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int id) {
        log.info("Inside getStudent");
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    }

    @GetMapping("/name/{studentName}")
    public ResponseEntity<List<Student>> getStudentByName(@PathVariable("studentName") String name) {
        log.info("Inside getStudentByName");
        return new ResponseEntity<>(studentService.getStudentByName(name), HttpStatus.OK);
    }

    @GetMapping("/class/{className}")
    public ResponseEntity<List<Student>> getStudentByClassName(@PathVariable("className") String className) {
        log.info("Inside getStudentByClassName");
        return new ResponseEntity<>(studentService.getStudentByClassName(className), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id) {
        log.info("Inside updateStudent");
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }


}
