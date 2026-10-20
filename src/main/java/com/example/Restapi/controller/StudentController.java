package com.example.Restapi.controller;

import com.example.Restapi.entity.StudentEntity;
import com.example.Restapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    //Create New Student
    @PostMapping
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentService.createStudent(student);
    }

    // Get All Students Details
    @GetMapping
    public List<StudentEntity> getStudents(){
        return studentService.getStudents();

    }

    //GetById Students
    @GetMapping("{id}")
    public StudentEntity getStudents(@PathVariable Long id){
        return studentService.getStudents(id);
    }

   //Delete ById Student
    @DeleteMapping("{id}")
    public String deleteStudents(@PathVariable  Long id){
        studentService.deleteStudents(id);
        return "Student Deleted";
    }
}