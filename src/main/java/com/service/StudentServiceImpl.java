package com.service;

import com.dao.*;
import com.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Autowired
    SanctionDao sanctionDao;

    @Autowired
    PersonalPlanDao personalPlanDao;

    @Autowired
    FamilyMemberDao familyMemberDao;

    @Autowired
    CommunicationDao communicationDao;

    @Override
    public Student insert(Student student) throws SQLException {
        studentDao.insert(student);
        return student;
    }

    @Override
    public Student update(Student student) throws SQLException {
        studentDao.update(student);
        return student;
    }

    @Override
    public List<Student> getStudentByStuName(String stuName) throws SQLException {
        return studentDao.selectByName(stuName);
    }

    @Override
    public List<Student> getStudentByClassId(int classsId) throws SQLException {
        return studentDao.selectByClassId(classsId);
    }

    @Override
    public Student getStudentById(long id) throws SQLException {
        return studentDao.selectById(id);
    }

    public Sanction insertOrUpdateSanction(Sanction sanction) throws SQLException{
        if (sanction.getId() < 1){
            sanctionDao.insert(sanction);
        }else {
            sanctionDao.update(sanction);
        }
        return sanction;
    }

    @Override
    public List<Sanction> getAllSanctions(int stu_id) throws SQLException {
        return sanctionDao.queryAllSanctions(stu_id);
    }

    @Override
    public PersonalPlan insertOrUpdatePersonalPlan(PersonalPlan personalPlan) throws SQLException {
        if (personalPlan.getId() < 1){
            personalPlanDao.insert(personalPlan);
        }else {
            personalPlanDao.update(personalPlan);
        }
        return personalPlan;
    }

    @Override
    public List<PersonalPlan> getAllPersonalPlans(int stu_Id) throws SQLException {
        return personalPlanDao.queryAllPersonalPlan(stu_Id);
    }

    @Override
    public FamilyMember insertOrUpdateFamilyMember(FamilyMember familyMember) throws SQLException {
        if(familyMember.getId()<1){
            familyMemberDao.insert(familyMember);
        }else {
            familyMemberDao.update(familyMember);
        }
        return familyMember;
    }

    @Override
    public List<FamilyMember> getAllFamilyMembers(int stu_Id) throws SQLException {
        return familyMemberDao.queryAllFamilyMembers(stu_Id);
    }

    @Override
    public Communication insertOrUpdateCommunicationFamily(Communication communication) throws SQLException {
        if (communication.getId() < 1){
            communicationDao.insert(communication);
        }else {
            communicationDao.update(communication);
        }
        return communication;
    }

    @Override
    public Communication selectFamilyCommunicationById(int id) throws SQLException {
        return communicationDao.selectFamilyCommunicationById(id);
    }

    @Override
    public List<Communication> getAllFamilyCommunications(int stu_id) throws SQLException {
        return communicationDao.getAllFamilyCommunications(stu_id);
    }

    @Override
    public Communication insertOrUpdateCommunicationStudent(Communication communication) throws SQLException {
        if (communication.getId() < 1){
            communicationDao.insert(communication);
        }else {
            communicationDao.update(communication);
        }
        return communication;
    }

    @Override
    public Communication selectStudentCommunicationById(int id) throws SQLException {
        return communicationDao.selectStudentCommunicationById(id);
    }

    @Override
    public List<Communication> getAllStudentCommunications(int stu_id) throws SQLException {
        return communicationDao.getAllStudentCommunications(stu_id);
    }

}
