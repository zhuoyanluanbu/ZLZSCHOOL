package com.controller;

import com.entity.FamilyMember;
import com.entity.PersonalPlan;
import com.entity.Sanction;
import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by huyoucheng on 2018/10/20.
 */
@RestController
@RequestMapping(value = "/student",produces = "application/json;charset=utf-8")
public class StudentController {

    @Autowired
    StudentService studentService;

    /*
    * 增加一个学生
    * */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Student insertStudent(@RequestBody Student student) throws Exception{
        return studentService.insert(student);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Student updateStudent(@RequestBody Student student) throws Exception{
        return studentService.update(student);
    }

    /*
    * 根据学生id查找学生
    * */
    @RequestMapping(value = "/stuid",method = RequestMethod.GET)
    public Student getStudentById(int stuId) throws Exception{
        return studentService.getStudentById(stuId);
    }

    /*
    * 根据学生名查找学生
    * */
    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public List<Student> getStudent(String stuName) throws Exception{
        return studentService.getStudentByStuName(stuName);
    }

    /*
    * 根据班级id查找学生
    * */
    @RequestMapping(value = "/classid",method = RequestMethod.GET)
    public List<Student> getStudent(int classsId) throws Exception{
        return studentService.getStudentByClassId(classsId);
    }

    //增加或者更新一个学生的奖罚记录
    @RequestMapping(value = "/sanction",method = RequestMethod.POST)
    public Sanction addOrUpdateSanctions(@RequestBody Sanction sanction) throws Exception{
        return studentService.insertOrUpdateSanction(sanction);
    }

    //查找学生的奖罚记录
    @RequestMapping(value = "/sanction",method = RequestMethod.GET)
    public List<Sanction> getAllSanctions(int stuId) throws Exception{
        return studentService.getAllSanctions(stuId);
    }

    //查找学生的个人规划
    @RequestMapping(value = "/personalplan",method = RequestMethod.GET)
    public List<PersonalPlan> getPersonalAllPlans(int stuId) throws Exception{
        return studentService.getAllPersonalPlans(stuId);
    }

    //增加或者更新学生的个人规划
    @RequestMapping(value = "/personalplan",method = RequestMethod.POST)
    public PersonalPlan addOrUpdatePersonalPlan(@RequestBody PersonalPlan personalPlan) throws Exception{
        return studentService.insertOrUpdatePersonalPlan(personalPlan);
    }

    //查找学生的家庭成员
    @RequestMapping(value = "/families",method = RequestMethod.GET)
    public List<FamilyMember> getFamilies(int stuId) throws Exception{
        return studentService.getAllFamilyMembers(stuId);
    }

    //增加或者修改家庭成员
    @RequestMapping(value = "/families",method = RequestMethod.POST)
    public FamilyMember addOrUpdateFamiliyMember(@RequestBody FamilyMember familyMember) throws Exception{
        return studentService.insertOrUpdateFamilyMember(familyMember);
    }

}
