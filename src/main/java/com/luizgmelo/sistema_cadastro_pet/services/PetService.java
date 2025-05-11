package com.luizgmelo.sistema_cadastro_pet.services;

import com.luizgmelo.sistema_cadastro_pet.dtos.PetDTO;
import com.luizgmelo.sistema_cadastro_pet.models.Pet;
import com.luizgmelo.sistema_cadastro_pet.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public void addPet(PetDTO addPetDTO) {
        Pet newPet = new Pet();
        newPet.setName(addPetDTO.nome());
        newPet.setAge(addPetDTO.idade());
        newPet.setType(addPetDTO.tipo());
        newPet.setWeight(addPetDTO.peso());
        petRepository.save(newPet);
    }
}
