package com.oesteCosmetica.oesteCos.presistence.repositories;

import com.oesteCosmetica.oesteCos.presistence.entitines.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity,Long> {

    /*
    @Query(value = "SELECT * FROM user WHERE username = :username", nativeQuery = true)
    Optional<UserEntity> findByUsername(String username);*/
    public Optional<UserEntity> findByUsername(String username);
}
