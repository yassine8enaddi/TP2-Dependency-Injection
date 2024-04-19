package com.example.tp2.service;

import com.example.tp2.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentServiceMock implements StudentService {

    List<Student> list = new ArrayList<>();

    @Override
    public void create(Student student) {
        list.add(student);
    }

    @Override
    public Optional<Student> rechercherParCNE(Integer cne) {
        return list.stream().filter(student -> student.getCNE().equals(cne)).findFirst();
    }

    @Override
    public void afficherListeEtudiants() {
        for (Student student : list) {
            System.out.println("CNE: " + student.getCNE() + "\nNOM: " + student.getNom() + "\nPRENOM: " + student.getPrenom() + "\nFILIERE: " + student.getFiliere());
        }
    }
}
