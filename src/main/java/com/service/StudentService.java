package com.service;

import com.entity.*;
import org.apache.ibatis.annotations.Param;
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



    Sanction insertOrUpdateSanction(Sanction sanction) throws SQLException;

    List<Sanction> getAllSanctions(int stu_id) throws SQLException;



    PersonalPlan insertOrUpdatePersonalPlan(PersonalPlan personalPlan) throws SQLException;

    List<PersonalPlan> getAllPersonalPlans(int stu_Id) throws SQLException;



    FamilyMember insertOrUpdateFamilyMember(FamilyMember familyMember) throws SQLException;

    List<FamilyMember> getAllFamilyMembers(int stu_Id) throws SQLException;




    Communication insertOrUpdateCommunicationFamily(Communication communication) throws SQLException;

    Communication selectFamilyCommunicationById(int id) throws SQLException;

    List<Communication> getAllFamilyCommunications(int stu_id) throws SQLException;


    Communication insertOrUpdateCommunicationStudent(Communication communication) throws SQLException;

    Communication selectStudentCommunicationById(int id) throws SQLException;

    List<Communication> getAllStudentCommunications(int stu_id) throws SQLException;

}
