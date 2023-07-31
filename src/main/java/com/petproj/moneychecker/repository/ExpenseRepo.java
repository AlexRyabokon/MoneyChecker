package com.petproj.moneychecker.repository;

import com.petproj.moneychecker.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expense, Long> {

}
