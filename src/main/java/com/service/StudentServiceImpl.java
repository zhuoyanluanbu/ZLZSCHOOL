package com.service;

import com.dao.StudentDao;
import com.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public Student insert(Student student) throws SQLException {
        studentDao.insert(student);
        return student;
    }

    @Override
    public Student update(Student student) throws SQLException {
        studentDao.update(student);
        return student;
    }

    @Override
    public List<Student> getStudentByStuName(String stuName) throws SQLException {
        return studentDao.selectByName(stuName);
    }

    @Override
    public List<Student> getStudentByClassId(int classsId) throws SQLException {
        return studentDao.selectByClassId(classsId);
    }

    @Override
    public Student getStudentById(long id) throws SQLException {
        return studentDao.selectById(id);
    }
}
