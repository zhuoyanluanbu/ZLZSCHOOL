package com.dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/22.
 */
public interface BaseDao<T,C> {

    int insert(T t) throws SQLException;

    int update(T t) throws SQLException;

    T selectById(C id) throws SQLException;

    List<T> selectByName(String name) throws SQLException;

    int delete(int id) throws SQLException;
}
