package com.spring.jwt.entity;

import com.spring.jwt.dto.B2BDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "UPDATE users SET is_deleted = true WHERE id=?")
@Where(clause = "is_deleted=false")
@Table(name = "B2B")
public class B2B {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "B2BId", nullable = false)
    private int id;

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

    @Column(name = "is_deleted", nullable = false)
    private Boolean deleted = Boolean.FALSE;



    public B2B(B2BDto b2BDto) {
        this.carId=b2BDto.getCarId();
        this.buyerDealerId=b2BDto.getBuyerDealerId();
        this.sellerId= b2BDto.getSellerId();
        this.time=b2BDto.getTime();
        this.message= b2BDto.getMessage();
        this.requestStatus= b2BDto.getRequestStatus();
    }



    public B2B(int carId, Integer buyerDealerId, Integer sellerId, LocalDateTime time, String message, Status requestStatus) {
        this.carId = carId;
        this.buyerDealerId = buyerDealerId;
        this.sellerId = sellerId;
        this.time = time;
        this.message = message;
        this.requestStatus = requestStatus;
    }
}

