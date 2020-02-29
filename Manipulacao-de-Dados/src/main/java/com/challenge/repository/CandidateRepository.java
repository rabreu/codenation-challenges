package com.challenge.repository;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, CandidateId> {
    @Query(value = "SELECT ca.* " +
            "FROM CANDIDATE ca " +
            "WHERE ca.USER_ID = :userId " +
            "AND ca.COMPANY_ID = :companyId " +
            "AND ca.ACCELERATION_ID = :accelerationId",
            nativeQuery = true)
    Optional<Candidate> findById(@Param("userId") Long userId, @Param("companyId") Long companyId, @Param("accelerationId") Long accelerationId);

    @Query(value = "SELECT ca.* FROM  " +
            "CANDIDATE ca " +
            "INNER JOIN COMPANY co " +
            "ON co.ID = ca.COMPANY_ID  " +
            "WHERE co.ID = :companyId",
            nativeQuery = true)
    List<Candidate> findByCompanyId(@Param("companyId") Long companyId);

    @Query(value = "SELECT ca.* " +
            "FROM CANDIDATE ca " +
            "WHERE ca.ACCELERATION_ID = :accelerationId",
    nativeQuery = true)
    List<Candidate> findByAccelerationId(@Param("accelerationId") Long accelerationId);


}
