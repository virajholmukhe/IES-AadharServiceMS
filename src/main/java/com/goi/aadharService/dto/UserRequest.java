package com.goi.aadharService.dto;


import jakarta.validation.constraints.*;

import java.util.Date;

public class UserRequest {

    @NotBlank(message = "{name.not.blank}")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "{name.pattern}")
    private String name;

    @NotNull(message = "{dob.not.empty}")
    @Past(message = "{dob.past}")
    private Date dob;

    @NotBlank(message = "{gender.not.blank}")
    @Pattern(regexp = "^(Male|Female|Others)$", message = "{gender.pattern}")
    private String gender;

    @NotEmpty(message = "{aadharNumber.not.empty}")
    @Pattern(regexp = "^[0-9]{12}$", message = "{aadharNumber.pattern}")
    private String aadharNumber;

    public String getName() { return name; }

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

    @Override
    public String toString() {
        return "UserRequest{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                '}';
    }

}
