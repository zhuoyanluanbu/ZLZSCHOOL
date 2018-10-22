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
public interface StudentDao {

    int insert(Student student) throws SQLException;

    List<Student> selectByStuName(String stuName) throws SQLException;

    Student updateStudent(Student student) throws SQLException;

}
