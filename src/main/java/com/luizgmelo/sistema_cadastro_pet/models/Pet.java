package com.luizgmelo.sistema_cadastro_pet.models;

import com.luizgmelo.sistema_cadastro_pet.enums.PetType;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private PetType type;

    private int age;

    private double weight;
}
