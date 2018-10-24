package com.controller;

import com.entity.Classs;
import com.service.ClasssService;
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
@RequestMapping(value = "/class",produces = "application/json;charset=utf-8")
public class ClasssController {

    @Autowired
    ClasssService classsService;

    /*
    * 增加一个班级
    * */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Classs insert(@RequestBody Classs classs) throws Exception{
        return classsService.insertClasss(classs);
    }

    /*
    * 更改班级信息
    * */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Classs update(@RequestBody Classs classs) throws Exception{
        return classsService.updateClasss(classs);
    }

    /*
    * 根据班级名字查找班级
    * */
    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public List<Classs> getClass(String claName) throws Exception{
        return classsService.getClasssByName(claName);
    }

    /*
    * 获取所有班级
    * */
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Classs> getAllClass() throws Exception{
        return classsService.getAllClasses();
//        throw new Exception("ccc");
    }

}
