package com.luizgmelo.sistema_cadastro_pet.dtos;

import com.luizgmelo.sistema_cadastro_pet.enums.PetType;

import java.util.UUID;

public record PetDTO(UUID id, String nome, PetType tipo, int idade, double peso) {
}
