package com.luizgmelo.sistema_cadastro_pet.dtos;


import com.luizgmelo.sistema_cadastro_pet.models.Pet;

import java.util.List;

public record ResponseListPetsDTO(List<PetDTO> allPets){

}
