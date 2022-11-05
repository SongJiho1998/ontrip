package com.sinabro.ontrip.domain.member.model.vo;

import java.util.Date;

public class member {

    private int member;
    private String memberId;
    private String memberPwd;
    private String memberName;
    private String gender;
    private String phone;
    private Date birthDate;
    private Boolean unregister;
    private Date enrollDate;
    private Date modifyDate;

    public member(int member, String memberId, String memberPwd, String memberName, String gender, String phone, Date birthDate, Boolean unregister, Date enrollDate, Date modifyDate) {
        this.member = member;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.gender = gender;
        this.phone = phone;
        this.birthDate = birthDate;
        this.unregister = unregister;
        this.enrollDate = enrollDate;
        this.modifyDate = modifyDate;
    }

    public int getMember() {
        return member;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public String getMemberName() {
        return memberName;
    }d

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Boolean getUnregister() {
        return unregister;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setUnregister(Boolean unregister) {
        this.unregister = unregister;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }


}
