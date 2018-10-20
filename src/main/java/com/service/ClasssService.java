package com.service;

import com.entity.Classs;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */
public interface ClasssService {

    Classs insertClasss(Classs classs) throws SQLException;

    List<Classs> getClasssByName(String claName) throws SQLException;

    List<Classs> getAllClasses() throws SQLException;

}
