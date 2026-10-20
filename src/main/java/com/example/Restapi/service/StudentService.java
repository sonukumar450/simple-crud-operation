package com.example.Restapi.service;

import com.example.Restapi.entity.StudentEntity;
import com.example.Restapi.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentEntity createStudent(StudentEntity student){
        return studentRepository.save(student);
    }

   public List<StudentEntity> getStudents(){
       return studentRepository.findAll();
   }

    public StudentEntity getStudents(Long id){
        return studentRepository.findById(id).orElseThrow();
    }

    public void deleteStudents(Long id){
         studentRepository.deleteById(id);
    }
}