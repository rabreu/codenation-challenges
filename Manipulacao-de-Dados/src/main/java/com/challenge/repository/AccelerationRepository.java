package com.challenge.repository;

import com.challenge.entity.Acceleration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccelerationRepository extends CrudRepository<Acceleration, Long> {
    @Query(value = "SELECT ac.* " +
            "FROM Acceleration ac " +
            "INNER JOIN Candidate ca " +
            "ON ac.id = ca.acceleration_id " +
            "INNER JOIN Company co " +
            "ON co.id = ca.company_id AND co.id = :companyId",
            nativeQuery = true)
    List<Acceleration> findByCompanyId(@Param("companyId") Long companyId);
}
