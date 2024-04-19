package com.example.tp2.repository;

import com.example.tp2.model.Student;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryStudentRepository implements StudentRepository {

    List<Student> studentList = new ArrayList<>();

    @Override
    public void save(Student student) {
        studentList.add((student));
    }

    @Override
    public Optional<Student> findById(Integer id) {
        return studentList.stream().filter(student -> student.getCNE().equals(id)).findFirst();
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @PostConstruct
    public void _init_() {
        Student s1 = new Student(1, "Ait ben addi", "Yassine", "génie informatique");
        Student s2 = new Student(2, "Nom2", "Prenom2", "filiere2");
        Student s3 = new Student(3, "Nom3", "Prenom3", "filiere3");
        Student s4 = new Student(4, "Nom4", "Prenom4", "filiere3");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
    }
}
