package com.challenge.repository;

import com.challenge.entity.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {
    @Query(value = "SELECT DISTINCT co.* " +
            "FROM COMPANY co " +
            "INNER JOIN CANDIDATE ca " +
            "ON ca.COMPANY_ID = co.ID  " +
            "INNER JOIN ACCELERATION ac " +
            "ON ac.ID = ca.ACCELERATION_ID  " +
            "WHERE ac.ID = :accelerationId",
            nativeQuery = true)
    List<Company> findByAccelerationId(@Param("accelerationId") Long accelerationId);

    @Query(value = "SELECT DISTINCT co.* " +
            "FROM COMPANY co " +
            "INNER JOIN CANDIDATE ca " +
            "ON ca.COMPANY_ID = co.ID  " +
            "INNER JOIN USERS us " +
            "ON us.ID = ca.USER_ID  " +
            "WHERE us.ID = :userId",
    nativeQuery = true)
    List<Company> findByUserId(@Param("userId")Long userId);
}
