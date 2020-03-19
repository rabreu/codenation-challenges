package com.challenge.repository;

import com.challenge.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findById(Long id);

    List<User> findByCandidatesIdAccelerationName(String name);

    List<User> findByCandidatesIdCompanyId(Long companyId);

    User findByEmail(String email);

}