package com.entity;

/**
 * Created by huyoucheng on 2018/11/3.
 */
public class Communication extends MyObject {
    private int id;
    private String topic;//沟通主题
    private String time;//沟通时间
    private String contentSummary;//内容摘要
    private int stu_id;
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContentSummary() {
        return contentSummary;
    }

    public void setContentSummary(String contentSummary) {
        this.contentSummary = contentSummary;
    }

    public Communication() {
    }

    public Communication(int id, String topic, String time, String contentSummary, int stu_id, String remark) {
        this.id = id;
        this.topic = topic;
        this.time = time;
        this.contentSummary = contentSummary;
        this.stu_id = stu_id;
        this.remark = remark;
    }
}
