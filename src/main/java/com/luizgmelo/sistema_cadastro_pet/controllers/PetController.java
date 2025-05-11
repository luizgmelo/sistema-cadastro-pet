package com.luizgmelo.sistema_cadastro_pet.controllers;

import com.luizgmelo.sistema_cadastro_pet.dtos.PetDTO;
import com.luizgmelo.sistema_cadastro_pet.dtos.ResponseAddPetDTO;
import com.luizgmelo.sistema_cadastro_pet.dtos.ResponseListAllPetsDTO;
import com.luizgmelo.sistema_cadastro_pet.models.Pet;
import com.luizgmelo.sistema_cadastro_pet.services.PetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public ResponseEntity<ResponseListAllPetsDTO> getAllPets() {
        List<Pet> allPets = petService.getAllPets();
        return ResponseEntity.ok(ResponseListAllPetsDTO.fromListPet(allPets));
    }

    @PostMapping
    public ResponseEntity<ResponseAddPetDTO> addPet(@RequestBody PetDTO petDTO) {
        petService.addPet(petDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseAddPetDTO("Cadastro realizado com sucesso"));
    }




}
