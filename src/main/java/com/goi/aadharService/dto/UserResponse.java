package com.goi.aadharService.dto;

import java.util.Date;

public class UserResponse {
    private String name;
    private Date dob;
    private String gender;
    private String aadharNumber;
    private String State;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
