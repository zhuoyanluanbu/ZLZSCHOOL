package com.entity;

import java.util.Date;

/**
 * Created by huyoucheng on 2018/10/30.
 */
public class PersonalPlan extends MyObject {
    private int id;
    private String goal;
    private String finished_time;
    private String remark;
    private int state = 0;
    private int stu_id = -1;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getFinished_time() {
        return finished_time;
    }

    public void setFinished_time(String finished_time) {
        this.finished_time = finished_time;
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

    public PersonalPlan() {
    }

    public PersonalPlan(int id, String goal, String finished_time, String remark, int state, int stu_id) {
        this.id = id;
        this.goal = goal;
        this.finished_time = finished_time;
        this.remark = remark;
        this.state = state;
        this.stu_id = stu_id;
    }
}
