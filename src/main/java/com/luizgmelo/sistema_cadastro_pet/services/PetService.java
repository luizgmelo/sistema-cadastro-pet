package com.luizgmelo.sistema_cadastro_pet.services;

import com.luizgmelo.sistema_cadastro_pet.dtos.PetDTO;
import com.luizgmelo.sistema_cadastro_pet.models.Pet;
import com.luizgmelo.sistema_cadastro_pet.repositories.PetRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> getAllPets(Specification<Pet> specification) {
        return petRepository.findAll(specification);
    }

    public void addPet(PetDTO addPetDTO) {
        Pet newPet = new Pet();
        newPet.setNome(addPetDTO.nome());
        newPet.setIdade(addPetDTO.idade());
        newPet.setTipo(addPetDTO.tipo());
        newPet.setPeso(addPetDTO.peso());
        petRepository.save(newPet);
    }

    public void deleteById(UUID id) {
        petRepository.deleteById(id);
    }
}
