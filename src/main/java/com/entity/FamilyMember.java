package com.entity;

/**
 * Created by huyoucheng on 2018/10/30.
 */
public class FamilyMember extends MyObject {
    private int id;
    private String relationship;//关系
    private String name;
    private String workunit;//工作单位
    private String phone;
    private String remark;
    private int state = 0;
    private int stu_id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkunit() {
        return workunit;
    }

    public void setWorkunit(String workunit) {
        this.workunit = workunit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public FamilyMember() {
    }

    public FamilyMember(int id, String relationship, String name, String workunit, String phone, String remark, int state, int stu_id) {
        this.id = id;
        this.relationship = relationship;
        this.name = name;
        this.workunit = workunit;
        this.phone = phone;
        this.remark = remark;
        this.state = state;
        this.stu_id = stu_id;
    }
}
