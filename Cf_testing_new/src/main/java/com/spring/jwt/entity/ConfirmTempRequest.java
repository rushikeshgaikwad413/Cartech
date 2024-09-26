package com.spring.jwt.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "ConfirmTempRequest")
public class ConfirmTempRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Temp_id")
    private Integer temp_Id;

    @Column(name = "carId")
    private int carId;

    @Column(name = "buyerDealerId")
    private Integer buyerDealerId;

    @Column(name = "sellerId")
    private Integer sellerId;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "message")
    private String message;

    @Column(name = "requestStatus")
    private Status requestStatus;


}
