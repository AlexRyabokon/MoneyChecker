package com.petproj.moneychecker.repository;

import com.petproj.moneychecker.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
