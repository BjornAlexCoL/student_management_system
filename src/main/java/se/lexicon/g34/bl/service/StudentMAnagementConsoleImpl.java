package se.lexicon.g34.bl.service;

import se.lexicon.g34.bl.data_access.StudentDao;
import se.lexicon.g34.bl.models.Student;
import se.lexicon.g34.bl.util.UserInputService;

import java.util.List;

public class StudentMAnagementConsoleImpl implements StudentManagement{
    UserInputService scannerService;
    StudentDao studentDao;

    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student Saver(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
