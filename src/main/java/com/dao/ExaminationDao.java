package com.dao;

import com.entity.Examination;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/23.
 */
public interface ExaminationDao extends BaseDao<Examination,Long> {

    int insert(Examination examination) throws SQLException;

    int update(Examination examination) throws SQLException;

    Examination selectById(long id) throws SQLException;
    
    List<Examination> selectByName(String examname) throws SQLException;

    List<Examination> selectByExamSerial(String examserial) throws SQLException;

}
