package com.service;

import com.entity.Student;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */

public interface StudentService {

    Student insert(Student student) throws SQLException;

    List<Student> getStudentByStuName(String stuName) throws SQLException;

}
