package com.entity;

/**
 * Created by huyoucheng on 2018/11/3.
 */
public class FamilyCommunication extends Communication {

    private String toWho;//和谁沟通
    private String feedback;//家长反馈

    public FamilyCommunication() {
    }

    public FamilyCommunication(int id, String topic, String time, String contentSummary, int stu_id, String toWho, String feedback, String remark) {
        super(id, topic, time, contentSummary, stu_id,remark);
        this.toWho = toWho;
        this.feedback = feedback;
    }

    public String getToWho() {
        return toWho;
    }

    public void setToWho(String toWho) {
        this.toWho = toWho;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
