package com.petproj.moneychecker.mappers;


import com.petproj.moneychecker.dto.CategoryDTO;
import com.petproj.moneychecker.entities.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);


}
