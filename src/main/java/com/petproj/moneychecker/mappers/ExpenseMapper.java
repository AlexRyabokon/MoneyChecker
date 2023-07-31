package com.petproj.moneychecker.mappers;

import com.petproj.moneychecker.dto.ExpenseDTO;
import com.petproj.moneychecker.entities.Expense;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExpenseMapper {
    ExpenseMapper INSTANCE = Mappers.getMapper(ExpenseMapper.class);

    ExpenseDTO expenceToExpenceDTO(Expense expense);

}
