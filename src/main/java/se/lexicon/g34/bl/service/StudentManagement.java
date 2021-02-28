package se.lexicon.g34.bl.service;

import se.lexicon.g34.bl.models.Student;

import java.util.List;

public interface StudentManagement {
    Student create();
    Student Save(Student student);
    Student find(int id);
    Student remove(int id);
    List<Student> findAll();
    Student edit(Student student);
}
