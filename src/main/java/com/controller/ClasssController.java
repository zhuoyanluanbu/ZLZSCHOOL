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

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Classs insert(@RequestBody Classs classs) throws Exception{
        return classsService.insertClasss(classs);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Classs update(@RequestBody Classs classs) throws Exception{
        return classsService.updateClasss(classs);
    }

    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public List<Classs> getClass(String claName) throws Exception{
        return classsService.getClasssByName(claName);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Classs> getAllClass() throws Exception{
        return classsService.getAllClasses();
    }

}
