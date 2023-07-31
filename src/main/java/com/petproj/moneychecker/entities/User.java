package com.petproj.moneychecker.entities;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
@Entity
@Table(name="users", schema = "public")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "balance")
    private BigDecimal balance;

    @OneToMany
    @JoinColumn(name = "category_id")
    private Set<Category> categories;


}
