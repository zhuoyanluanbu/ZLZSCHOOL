package com.controller;

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


}
