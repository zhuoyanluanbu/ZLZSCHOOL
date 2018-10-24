package com.dao;

import com.entity.Subject;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/22.
 */
@Repository
public interface SubjectDao extends BaseDao<Subject,Long> {

    int insert(Subject subject) throws SQLException;

    int update(Subject subject) throws SQLException;

    Subject selectById(long id) throws SQLException;

    List<Subject> selectByName(String name) throws SQLException;
}
