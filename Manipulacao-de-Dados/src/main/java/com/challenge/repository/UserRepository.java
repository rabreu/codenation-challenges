package com.challenge.repository;

import com.challenge.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "SELECT us.* " +
            "FROM USERS us " +
            "INNER JOIN CANDIDATE ca " +
            "ON us.ID = ca.USER_ID " +
            "INNER JOIN ACCELERATION ac " +
            "ON ac.ID = ca.ACCELERATION_ID AND ac.name = :accelerationName",
            nativeQuery = true)
    List<User> findByAccelerationName(@Param("accelerationName") String name);

    @Query(value = "SELECT us.* " +
            "FROM USERS us " +
            "INNER JOIN CANDIDATE ca " +
            "ON us.ID = ca.USER_ID " +
            "INNER JOIN COMPANY co " +
            "ON ca.COMPANY_ID = co.ID AND co.ID = :companyId",
            nativeQuery = true)
    List<User> findByCompanyId(@Param("companyId") Long companyId);
}