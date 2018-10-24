package com.service;

import com.entity.Student;
import com.entity.Subject;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/23.
 */
public interface SubjectService {

    Subject insert(Subject subject) throws SQLException;

    Subject update(Subject subject) throws SQLException;

    List<Subject> getSubjectBySubName(String subName) throws SQLException;

}
