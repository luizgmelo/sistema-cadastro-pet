package com.luizgmelo.sistema_cadastro_pet.repositories;

import com.luizgmelo.sistema_cadastro_pet.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PetRepository extends JpaRepository<Pet, UUID> {
}
