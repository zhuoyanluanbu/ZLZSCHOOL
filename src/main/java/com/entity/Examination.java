package com.entity;

/**
 * Created by huyoucheng on 2018/10/23.
 */
public class Examination extends MyObject {

    private long id;
    private String examserial;//这里可以使考试时间
    private String examname;
    private String remark;
    private int state;

    public Examination() {
    }

    public Examination(long id, String examserial, String examname, String remark,int state) {
        this.id = id;
        this.examserial = examserial;
        this.examname = examname;
        this.remark = remark;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExamserial() {
        return examserial;
    }

    public void setExamserial(String examserial) {
        this.examserial = examserial;
    }

    public String getExamname() {
        return examname;
    }

    public void setExamname(String examname) {
        this.examname = examname;
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
