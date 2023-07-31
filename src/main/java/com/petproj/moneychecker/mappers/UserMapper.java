package com.petproj.moneychecker.mappers;

import com.petproj.moneychecker.dto.UserDTO;
import com.petproj.moneychecker.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);


}
