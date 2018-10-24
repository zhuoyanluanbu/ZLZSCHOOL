package com.dao;

import com.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */
@Repository
public interface StudentDao extends BaseDao<Student,Long>{

    int insert(Student student) throws SQLException;

    List<Student> selectByName(String stuName) throws SQLException;

    int update(Student student) throws SQLException;

    List<Student> selectByClassId(int classsId) throws SQLException;

}
