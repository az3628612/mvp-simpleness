package com.example.administrator.mvpdemo.service.entity;

public class UserBean {
    private int followNum;
    private String os;
    private String major;
    private int sex;
    private String schoolName;
    private String nickname;
    private String star;
    private int fansNum;
    private String avatar;
    private String updateDate;
    private int id;
    private String token;
    private int userId;
    private int grade;
    private String account;
    private String regFrom;
    private int schoolId;
    private String createDate;
    private String lastLoginTime;
    private String rykey;
    private int emotion;
    private String label;
    private String remark;
    private String code;
    private String message;
    private boolean success;
    private int leaguerType;

    public int getLeaguerType() {
        return leaguerType;
    }

    public void setLeaguerType(int leaguerType) {
        this.leaguerType = leaguerType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public int getPointCount() {
        return pointCount;
    }

    public void setPointCount(int pointCount) {
        this.pointCount = pointCount;
    }

    private int visitCount;
    private int pointCount;


    public int getEmotion() {
        return emotion;
    }

    public void setEmotion(int emotion) {
        this.emotion = emotion;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    private String signature;

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    private String background;

    public int getFollowNum() {
        return followNum;
    }

    public void setFollowNum(int followNum) {
        this.followNum = followNum;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRegFrom() {
        return regFrom;
    }

    public void setRegFrom(String regFrom) {
        this.regFrom = regFrom;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getRykey() {
        return rykey;
    }

    public void setRykey(String rykey) {
        this.rykey = rykey;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "followNum=" + followNum +
                ", os='" + os + '\'' +
                ", major='" + major + '\'' +
                ", sex=" + sex +
                ", schoolName='" + schoolName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", star='" + star + '\'' +
                ", fansNum=" + fansNum +
                ", avatar='" + avatar + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", id=" + id +
                ", token='" + token + '\'' +
                ", userId=" + userId +
                ", grade=" + grade +
                ", account='" + account + '\'' +
                ", regFrom='" + regFrom + '\'' +
                ", schoolId=" + schoolId +
                ", createDate='" + createDate + '\'' +
                ", lastLoginTime='" + lastLoginTime + '\'' +
                ", rykey='" + rykey + '\'' +
                ", emotion=" + emotion +
                ", label='" + label + '\'' +
                ", remark='" + remark + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", success=" + success +
                ", leaguerType=" + leaguerType +
                ", visitCount=" + visitCount +
                ", pointCount=" + pointCount +
                ", signature='" + signature + '\'' +
                ", background='" + background + '\'' +
                '}';
    }
}