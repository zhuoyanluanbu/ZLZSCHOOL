package com.entity;

/**
 * Created by huyoucheng on 2018/10/20.
 */
public class Student extends MyObject {

    private long id;
    private String studentnum;//学号
    private String studentName;
    private int sex;
    private String birthday;
    private String politicalstatus;//政治面貌
    private String educationallevel;//学历
    private String idnumber;
    private String phone;
    private String homeaddress;
    private String qqnumber;
    private String wechatnumber;
    private int issmoke = -1;
    private int smokeage = 0;
    private String whysmoke;
    private int islove = -1;
    private String whylove;
    private String loverinformation;//恋爱对象信息
    private int isviolence = -1;
    private String whyviolence;
    private String medicalhistory;//病史
    private String lifeexpenses;//生活开销
    private String homeincome;//家庭收入
    private String hobby;//兴趣爱好
    private String performance;//表现
    private String remark;
    private int state;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPoliticalstatus() {
        return politicalstatus;
    }

    public void setPoliticalstatus(String politicalstatus) {
        this.politicalstatus = politicalstatus;
    }

    public String getEducationallevel() {
        return educationallevel;
    }

    public void setEducationallevel(String educationallevel) {
        this.educationallevel = educationallevel;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    public String getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(String qqnumber) {
        this.qqnumber = qqnumber;
    }

    public String getWechatnumber() {
        return wechatnumber;
    }

    public void setWechatnumber(String wechatnumber) {
        this.wechatnumber = wechatnumber;
    }

    public int getIssmoke() {
        return issmoke;
    }

    public void setIssmoke(int issmoke) {
        this.issmoke = issmoke;
    }

    public int getSmokeage() {
        return smokeage;
    }

    public void setSmokeage(int smokeage) {
        this.smokeage = smokeage;
    }

    public String getWhysmoke() {
        return whysmoke;
    }

    public void setWhysmoke(String whysmoke) {
        this.whysmoke = whysmoke;
    }

    public int getIslove() {
        return islove;
    }

    public void setIslove(int islove) {
        this.islove = islove;
    }

    public String getWhylove() {
        return whylove;
    }

    public void setWhylove(String whylove) {
        this.whylove = whylove;
    }

    public String getLoverinformation() {
        return loverinformation;
    }

    public void setLoverinformation(String loverinformation) {
        this.loverinformation = loverinformation;
    }

    public int getIsviolence() {
        return isviolence;
    }

    public void setIsviolence(int isviolence) {
        this.isviolence = isviolence;
    }

    public String getWhyviolence() {
        return whyviolence;
    }

    public void setWhyviolence(String whyviolence) {
        this.whyviolence = whyviolence;
    }

    public String getMedicalhistory() {
        return medicalhistory;
    }

    public void setMedicalhistory(String medicalhistory) {
        this.medicalhistory = medicalhistory;
    }

    public String getLifeexpenses() {
        return lifeexpenses;
    }

    public void setLifeexpenses(String lifeexpenses) {
        this.lifeexpenses = lifeexpenses;
    }

    public String getHomeincome() {
        return homeincome;
    }

    public void setHomeincome(String homeincome) {
        this.homeincome = homeincome;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Student(){}

    public Student(long id, String studentnum, String studentName, int sex, String birthday, String politicalstatus, String educationallevel, String idnumber, String phone, String homeaddress, String qqnumber, String wechatnumber, int issmoke, int smokeage, String whysmoke, int islove, String whylove, String loverinformation, int isviolence, String whyviolence, String medicalhistory, String lifeexpenses, String homeincome, String hobby, String performance, String remark,int state) {
        this.id = id;
        this.studentnum = studentnum;
        this.studentName = studentName;
        this.sex = sex;
        this.birthday = birthday;
        this.politicalstatus = politicalstatus;
        this.educationallevel = educationallevel;
        this.idnumber = idnumber;
        this.phone = phone;
        this.homeaddress = homeaddress;
        this.qqnumber = qqnumber;
        this.wechatnumber = wechatnumber;
        this.issmoke = issmoke;
        this.smokeage = smokeage;
        this.whysmoke = whysmoke;
        this.islove = islove;
        this.whylove = whylove;
        this.loverinformation = loverinformation;
        this.isviolence = isviolence;
        this.whyviolence = whyviolence;
        this.medicalhistory = medicalhistory;
        this.lifeexpenses = lifeexpenses;
        this.homeincome = homeincome;
        this.hobby = hobby;
        this.performance = performance;
        this.remark = remark;
        this.state = state;
    }

    public static void main(String[] args) {
        System.out.println(new Student().toString());
    }
}
