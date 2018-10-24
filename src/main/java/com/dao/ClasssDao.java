package com.dao;

import com.entity.Classs;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */
@Repository
public interface ClasssDao extends BaseDao<Classs,Long>{

    int insert(Classs classs) throws SQLException;

    List<Classs> selectByName(String claName) throws SQLException;

    List<Classs> getAllClasses() throws SQLException;

    int update(Classs classs) throws SQLException;

    Classs selectById(long id) throws SQLException;

}
