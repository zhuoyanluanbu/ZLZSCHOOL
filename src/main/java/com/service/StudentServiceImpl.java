package com.service;

import com.dao.FamilyMemberDao;
import com.dao.PersonalPlanDao;
import com.dao.SanctionDao;
import com.dao.StudentDao;
import com.entity.FamilyMember;
import com.entity.PersonalPlan;
import com.entity.Sanction;
import com.entity.Student;
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

    public Sanction insertSanction(Sanction sanction) throws SQLException{
        sanctionDao.insert(sanction);
        return sanction;
    }

    @Override
    public List<Sanction> getAllSanctions(int stu_id) throws SQLException {
        return sanctionDao.queryAllSanctions(stu_id);
    }

    @Override
    public List<PersonalPlan> getAllPersonalPlans(int stu_Id) throws SQLException {
        return personalPlanDao.queryAllPersonalPlan(stu_Id);
    }

    @Override
    public List<FamilyMember> getAllFamilyMembers(int stu_Id) throws SQLException {
        return familyMemberDao.queryAllFamilyMembers(stu_Id);
    }

}
