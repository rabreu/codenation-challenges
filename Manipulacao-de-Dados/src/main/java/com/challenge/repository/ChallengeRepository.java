package com.challenge.repository;

import com.challenge.entity.Challenge;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengeRepository extends CrudRepository<Challenge, Long> {
    @Query(value = "SELECT ch.* " +
            "FROM CHALLENGE ch " +
            "INNER JOIN ACCELERATION ac " +
            "ON ac.CHALLENGE_ID = ch.ID  " +
            "INNER JOIN CANDIDATE ca " +
            "ON ca.ACCELERATION_ID  = ac.ID  " +
            "WHERE ac.ID = :accelerationId " +
            "AND ca.USER_ID = :userId",
            nativeQuery = true)
    List<Challenge> findByAccelerationIdAndUserId(@Param("accelerationId") Long accelerationId, @Param("userId") Long userId);
}
