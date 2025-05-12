package com.luizgmelo.sistema_cadastro_pet.specifications;

import com.luizgmelo.sistema_cadastro_pet.enums.PetType;
import com.luizgmelo.sistema_cadastro_pet.models.Pet;
import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Or;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

public class SpecificationPetTemplate {
    @Or(
            {
                    @Spec(path = "nome", spec = LikeIgnoreCase.class),
                    @Spec(path = "idade", spec = Equal.class),
                    @Spec(path = "peso", spec = Between.class, params = {"pesoMin", "pesoMax"})
            }
    )
    public interface ISpecificationPetTemplate extends Specification<Pet> {

    }
}
