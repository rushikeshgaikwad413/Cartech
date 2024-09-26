package com.spring.jwt.dto;

import com.spring.jwt.entity.BeadingCAR;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
public class BidCarsDTO {

    private Integer bidCarId;

    private Integer beadingCarId;

    private LocalDateTime closingTime;

    private LocalDateTime createdAt;

    private Integer basePrice;

    private Integer userId;


    public BidCarsDTO(BeadingCAR beadingCAR) {
    }
}
