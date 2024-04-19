package com.example.tp2.service;

import com.example.tp2.model.Student;

import java.util.Optional;

public interface StudentService {

    public void create(Student student);
    public Optional<Student> rechercherParCNE(Integer cne);
    public void afficherListeEtudiants();
}
