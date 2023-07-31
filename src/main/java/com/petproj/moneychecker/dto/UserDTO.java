package com.petproj.moneychecker.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class UserDTO {
    private long id;
    private String username;
    private String email;
    private BigDecimal balance;

}
