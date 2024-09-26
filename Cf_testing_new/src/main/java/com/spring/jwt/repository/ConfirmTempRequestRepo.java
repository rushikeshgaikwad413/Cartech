package com.spring.jwt.repository;

import com.spring.jwt.entity.ConfirmTempRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfirmTempRequestRepo extends JpaRepository<ConfirmTempRequest, Integer> {

}