package com.luizgmelo.sistema_cadastro_pet.dtos;

import com.luizgmelo.sistema_cadastro_pet.enums.PetType;

public record PetDTO(String nome, PetType tipo, int idade, double peso) {
}
