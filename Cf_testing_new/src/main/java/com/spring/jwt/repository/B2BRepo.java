package com.spring.jwt.repository;

import com.spring.jwt.entity.B2B;
import com.spring.jwt.entity.Car;
import com.spring.jwt.entity.CarVerified;
import com.spring.jwt.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface B2BRepo extends JpaRepository<B2B, Integer> {


    int countByRequestStatusAndBuyerDealerId(Status requestStatus, int dealerId);


    List<B2B> findByRequestStatus(Status status);
}

