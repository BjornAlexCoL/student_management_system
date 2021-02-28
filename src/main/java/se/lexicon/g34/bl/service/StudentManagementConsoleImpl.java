package se.lexicon.g34.bl.service;

import org.springframework.beans.factory.annotation.Autowired;
import se.lexicon.g34.bl.data_access.StudentDao;
import se.lexicon.g34.bl.models.Student;
import se.lexicon.g34.bl.util.UserInputService;

import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement{
    UserInputService scannerService;
    StudentDao studentDao;

    @Override
    public Student create() {
        return new Student(scannerService.getInt(),scannerService.getString());
    }

    @Override
    public Student Save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {
        return studentDao.find(id);
    }

    @Override
    public Student remove(int id){
        Student studentToRemove=studentDao.find(id);
        if (studentToRemove==null) throw new IllegalArgumentException("Cant remove something that don't exists");
        studentDao.delete(id);
        return studentToRemove;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        return studentDao.save(student);
    }
}
