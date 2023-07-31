package com.petproj.moneychecker.dto;

import com.petproj.moneychecker.entities.Category;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class ExpenseDTO {
    private long id;
    private long amount;
    private String description;
    private LocalDate date;
    private Category category;
}
