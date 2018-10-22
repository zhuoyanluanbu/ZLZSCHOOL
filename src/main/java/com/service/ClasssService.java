package com.service;

import com.entity.Classs;
import org.apache.ibatis.jdbc.SQL;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */
public interface ClasssService {

    Classs insertClasss(Classs classs) throws SQLException;

    List<Classs> getClasssByName(String claName) throws SQLException;

    List<Classs> getAllClasses() throws SQLException;

    Classs updateClasss(Classs classs) throws SQLException;

}
