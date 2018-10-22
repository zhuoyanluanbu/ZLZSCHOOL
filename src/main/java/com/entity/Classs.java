package com.entity;

import com.entity.MyObject;

/**
 * Created by huyoucheng on 2018/10/20.
 */
public class Classs extends MyObject{

    private int id;
    private int grade;
    private String classname;
    private String master;
    private String remark;
    private int state;

    public Classs(int id, int grade, String classname, String master, String remark,int state) {
        this.id = id;
        this.grade = grade;
        this.classname = classname;
        this.master = master;
        this.remark = remark;
        this.state = state;
    }

    public Classs() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
