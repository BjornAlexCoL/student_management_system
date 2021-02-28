package se.lexicon.g34.bl.data_access;

import se.lexicon.g34.bl.models.Student;

import java.util.List;

public interface StudentDao {
    Student save(Student student);
    Student find(int id);
    List<Student> findAll();
    void delete(int id);

}
