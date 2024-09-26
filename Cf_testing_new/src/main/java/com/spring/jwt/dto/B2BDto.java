package com.spring.jwt.dto;

import com.spring.jwt.entity.B2B;
import com.spring.jwt.entity.Car;
import com.spring.jwt.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class B2BDto {

    private int carId;

    private Integer buyerDealerId;

    private Integer sellerId;

    private LocalDateTime time;

    private String message;

    private Status requestStatus;


    private Integer userId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String email;
    private String mobileNo;


    public B2BDto(B2B b2B){
        this.carId=b2B.getCarId();
        this.buyerDealerId= b2B.getBuyerDealerId();
        this.sellerId= b2B.getSellerId();
        this.time=b2B.getTime();
        this.message= b2B.getMessage();
        this.requestStatus=b2B.getRequestStatus();
    }


    public B2BDto(int carId, Integer buyerDealerId, Integer sellerId, LocalDateTime time, String message,
                  Integer userId, String firstName, String lastName, String address, String city, String email, String mobileNo) {
        this.carId = carId;
        this.buyerDealerId = buyerDealerId;
        this.sellerId = sellerId;
        this.time = time;
        this.message = message;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.email = email;
        this.mobileNo = mobileNo;
    }

}
