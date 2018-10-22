package com.dao;

import com.entity.Classs;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */
@Repository
public interface ClasssDao {

    int insertClasss(Classs classs) throws SQLException;

    List<Classs> getClasssByName(String claName) throws SQLException;

    List<Classs> getAllClasses() throws SQLException;

    Classs updateClasss(Classs classs) throws SQLException;

}
