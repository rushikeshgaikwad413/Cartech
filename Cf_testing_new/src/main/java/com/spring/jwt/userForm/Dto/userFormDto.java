package com.spring.jwt.userForm.Dto;

import lombok.Data;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
@Data
public class userFormDto {

    public Integer userFormId;

    public String carOwnerName;

    public String brand;

    public String model;

    private String variant;

    public String regNo;

    public String address1;

    public String address2;

    public  Integer pinCode;

    public  String rc;

    public Date inspectionDate;

    public String mobileNo;

    public LocalDateTime createdTime;

    public String status;

    public Integer userId;

    private Integer salesPersonId;

    public Integer inspectorId;

}
