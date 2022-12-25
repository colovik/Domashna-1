package com.example.domasna2.repository.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.domasna2.model.Userr;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<Userr, String> {
    Optional<Userr> findByUsernameAndPassword(String username, String password);
    Optional<Userr> findByUsername(String username);
}