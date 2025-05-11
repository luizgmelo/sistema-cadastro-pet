package com.luizgmelo.sistema_cadastro_pet.dtos;


import com.luizgmelo.sistema_cadastro_pet.models.Pet;

import java.util.List;

public record ResponseListAllPetsDTO(List<PetDTO> allPets){
    public static ResponseListAllPetsDTO fromListPet(List<Pet> petList) {
        return new ResponseListAllPetsDTO(
                petList.stream()
                        .map(pet -> new PetDTO(pet.getName(), pet.getType(), pet.getAge(), pet.getWeight()))
                        .toList()
        );
    }
}
