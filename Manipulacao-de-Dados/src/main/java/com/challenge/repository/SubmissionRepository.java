package com.challenge.repository;

import com.challenge.entity.Submission;
import com.challenge.entity.SubmissionId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface SubmissionRepository extends CrudRepository<Submission, SubmissionId> {
    @Query(value = "SELECT MAX(su.SCORE) MAX_SCORE " +
            "FROM SUBMISSION su " +
            "WHERE su.CHALLENGE_ID = :challengeId",
            nativeQuery = true)
    BigDecimal findHigherScoreByChallengeId(@Param("challengeId") Long challengeId);

    @Query(value = "SELECT su.* " +
            "FROM SUBMISSION su " +
            "INNER JOIN CHALLENGE ch " +
            "ON ch.ID = su.CHALLENGE_ID  " +
            "INNER JOIN ACCELERATION ac " +
            "ON ac.CHALLENGE_ID = ch.ID  " +
            "WHERE ac.ID = :accelerationId " +
            "AND ch.ID = :challengeId",
            nativeQuery = true)
    List<Submission> findByChallengeIdAndAccelerationId(@Param("challengeId") Long challengeId, @Param("accelerationId") Long accelerationId);
}