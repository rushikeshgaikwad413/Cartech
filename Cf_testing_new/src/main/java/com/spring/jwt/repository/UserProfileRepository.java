package com.spring.jwt.repository;

import com.spring.jwt.entity.Userprofile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserProfileRepository extends JpaRepository<Userprofile,Integer> {

    @Modifying
    @Query(value = "DELETE FROM dealer_jwt.userprofile WHERE user_profile_id=:user_id", nativeQuery = true)
    public void DeleteById(int user_id);

    @Query("SELECT up FROM Userprofile up WHERE up.user.id = :userId")
    Optional<Userprofile> findByUserId(@Param("userId") Integer userId);


//    Optional<Userprofile> findByUserId(Integer userId);

}