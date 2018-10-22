package com.service;

import com.dao.ClasssDao;
import com.entity.Classs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */
@Service
public class ClasssServiceImpl implements ClasssService {

    @Autowired
    ClasssDao classsDao;

    @Override
    public Classs insertClasss(Classs classs) throws SQLException {
        classsDao.insertClasss(classs);
        return classs;
    }

    @Override
    public Classs updateClasss(Classs classs) throws SQLException {
        classsDao.updateClasss(classs);
        return classs;
    }

    @Override
    public List<Classs> getClasssByName(String claName) throws SQLException {
        return classsDao.getClasssByName(claName);
    }

    @Override
    public List<Classs> getAllClasses() throws SQLException {
        return classsDao.getAllClasses();
    }


}
