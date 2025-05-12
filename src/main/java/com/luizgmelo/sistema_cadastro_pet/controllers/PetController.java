package com.luizgmelo.sistema_cadastro_pet.controllers;

import com.luizgmelo.sistema_cadastro_pet.dtos.PetDTO;
import com.luizgmelo.sistema_cadastro_pet.dtos.ResponseAddPetDTO;
import com.luizgmelo.sistema_cadastro_pet.dtos.ResponseListPetsDTO;
import com.luizgmelo.sistema_cadastro_pet.enums.PetType;
import com.luizgmelo.sistema_cadastro_pet.models.Pet;
import com.luizgmelo.sistema_cadastro_pet.services.PetService;
import com.luizgmelo.sistema_cadastro_pet.specifications.SpecificationPetTemplate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public ResponseEntity<ResponseListPetsDTO> getAllPets(@RequestParam PetType tipo, SpecificationPetTemplate.ISpecificationPetTemplate specification) {
        Specification<Pet> tipoSpecification = (root, query, cb) -> cb.equal(root.get("tipo"), tipo.toString().toUpperCase());
        List<Pet> pets = petService.getAllPets(tipoSpecification.and(specification));
        List<PetDTO> listPets = pets.stream()
                .map(pet -> new PetDTO(pet.getId(), pet.getNome(), pet.getTipo(), pet.getIdade(), pet.getPeso()))
                .toList();
        return ResponseEntity.ok(new ResponseListPetsDTO(listPets));
    }

    @PostMapping
    public ResponseEntity<ResponseAddPetDTO> addPet(@RequestBody PetDTO petDTO) {
        petService.addPet(petDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseAddPetDTO("Cadastro realizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removePet(@PathVariable UUID id) {
        petService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
