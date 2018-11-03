package com.entity;

/**
 * Created by huyoucheng on 2018/11/3.
 */
public class StudentCommunication extends Communication {

    private String where;
    private String solution;//解决办法
    private String discussionResult;//座谈结果
    private String improvitionResult;//改进结果

    public StudentCommunication(String where, String solution, String discussionResult, String improvitionResult) {
        this.where = where;
        this.solution = solution;
        this.discussionResult = discussionResult;
        this.improvitionResult = improvitionResult;
    }

    public StudentCommunication(int id, String topic, String time, String contentSummary, int stu_id, String remark, String where, String solution, String discussionResult, String improvitionResult) {
        super(id, topic, time, contentSummary, stu_id, remark);
        this.where = where;
        this.solution = solution;
        this.discussionResult = discussionResult;
        this.improvitionResult = improvitionResult;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getDiscussionResult() {
        return discussionResult;
    }

    public void setDiscussionResult(String discussionResult) {
        this.discussionResult = discussionResult;
    }

    public String getImprovitionResult() {
        return improvitionResult;
    }

    public void setImprovitionResult(String improvitionResult) {
        this.improvitionResult = improvitionResult;
    }
}
