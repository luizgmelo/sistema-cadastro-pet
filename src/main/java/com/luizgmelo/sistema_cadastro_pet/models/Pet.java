package com.luizgmelo.sistema_cadastro_pet.models;

import com.luizgmelo.sistema_cadastro_pet.enums.PetType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_pet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    private PetType tipo;

    private int idade;

    private double peso;
}
