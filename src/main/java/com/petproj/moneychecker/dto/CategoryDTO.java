package com.petproj.moneychecker.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
public class CategoryDTO {
    private long id;
    private String name;
    private String description;
    private Set<ExpenseDTO> expenseSet;
    private UserDTO user;
}
