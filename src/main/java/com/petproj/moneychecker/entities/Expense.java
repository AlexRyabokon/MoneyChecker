package com.petproj.moneychecker.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
@Entity
@Table(name = "expenses", schema = "public")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="amount", nullable = false)
    private long amount;
    @Column(name="exp_description", nullable = true)
    private String description;
    @Column(name = "date", nullable = false)
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
