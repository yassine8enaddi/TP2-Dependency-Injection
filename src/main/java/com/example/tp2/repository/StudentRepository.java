package com.example.tp2.repository;

import com.example.tp2.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    public void save(Student student);

    public Optional<Student> findById(Integer id);

    public List<Student> findAll();
}
