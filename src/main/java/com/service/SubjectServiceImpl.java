package com.service;

import com.dao.SubjectDao;
import com.entity.Student;
import com.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/23.
 */
@Service
public class SubjectServiceImpl implements SubjectService{

    @Autowired
    SubjectDao subjectDao;

    @Override
    public Subject insert(Subject subject) throws SQLException {
        subjectDao.insert(subject);
        return subject;
    }

    @Override
    public Subject update(Subject subject) throws SQLException {
        subjectDao.update(subject);
        return subject;
    }

    @Override
    public List<Subject> getSubjectBySubName(String subName) throws SQLException {
        return subjectDao.selectByName(subName);
    }
}
