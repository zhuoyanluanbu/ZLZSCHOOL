package com.service;

import com.entity.FamilyMember;
import com.entity.PersonalPlan;
import com.entity.Sanction;
import com.entity.Student;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */

public interface StudentService {

    Student insert(Student student) throws SQLException;

    Student update(Student student) throws SQLException;

    List<Student> getStudentByStuName(String stuName) throws SQLException;

    List<Student> getStudentByClassId(int classsId) throws SQLException;

    Student getStudentById(long id) throws SQLException;

    Sanction insertSanction(Sanction sanction) throws SQLException;

    List<Sanction> getAllSanctions(int stu_id) throws SQLException;

    List<PersonalPlan> getAllPersonalPlans(int stu_Id) throws SQLException;

    List<FamilyMember> getAllFamilyMembers(int stu_Id) throws SQLException;
}
