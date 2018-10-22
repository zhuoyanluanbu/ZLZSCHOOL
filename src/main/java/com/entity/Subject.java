package com.entity;

/**
 * Created by huyoucheng on 2018/10/22.
 */
public class Subject {

    private int id;

    private String subjectname;

    private int class_id;

    private String remark;

    private int state;

    public Subject(){}

    public Subject(int state, String remark, int class_id, String subjectname, int id) {
        this.state = state;
        this.remark = remark;
        this.class_id = class_id;
        this.subjectname = subjectname;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
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
