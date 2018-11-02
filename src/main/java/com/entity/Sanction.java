package com.entity;

import java.util.Date;

/**
 * Created by huyoucheng on 2018/10/30.
 */
public class Sanction extends MyObject {

    private int id;

    private String time;

    private String sanctionrank;//奖罚级别

    private String sanctionname;//将罚名

    private String level;

    private String other;//其他

    private String remark;//备注

    private String state;//状态

    private int stu_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSanctionrank() {
        return sanctionrank;
    }

    public void setSanctionrank(String sanctionrank) {
        this.sanctionrank = sanctionrank;
    }

    public String getSanctionname() {
        return sanctionname;
    }

    public void setSanctionname(String sanctionname) {
        this.sanctionname = sanctionname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public Sanction() {
    }

    public Sanction(int id, String time, String sanctionrank, String sanctionname, String level, String other, String remark, String state, int stu_id) {
        this.id = id;
        this.time = time;
        this.sanctionrank = sanctionrank;
        this.sanctionname = sanctionname;
        this.level = level;
        this.other = other;
        this.remark = remark;
        this.state = state;
        this.stu_id = stu_id;
    }
}
