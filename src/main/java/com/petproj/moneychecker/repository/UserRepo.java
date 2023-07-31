package com.petproj.moneychecker.repository;

import com.petproj.moneychecker.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

}
