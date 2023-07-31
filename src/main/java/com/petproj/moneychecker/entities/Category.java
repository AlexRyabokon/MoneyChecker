package com.petproj.moneychecker.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
@Entity
@Table(name = "categories", schema = "public")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Expense> expenseSet;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
