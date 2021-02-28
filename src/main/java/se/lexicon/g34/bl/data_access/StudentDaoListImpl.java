package se.lexicon.g34.bl.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.g34.bl.models.Student;

import java.util.ArrayList;
import java.util.List;

@Component("StudentDaoListImpl")
public class StudentDaoListImpl implements StudentDao {
    List<Student> students = new ArrayList<>();
    @Override
    public Student save(Student student) {
        if(student==null) throw new IllegalArgumentException("Student is null");
        Student studentExist=find(student.getId());
        if (studentExist==null) students.add(student);
        else studentExist.setName(student.getName());
        return student;
    }

    @Override
    public Student find(int id) {

        if (id <= 0) {
            throw new IllegalArgumentException("Bad id");
        }
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void delete(int id) {
        students.removeIf(student -> student.getId()==id);
    }
}
