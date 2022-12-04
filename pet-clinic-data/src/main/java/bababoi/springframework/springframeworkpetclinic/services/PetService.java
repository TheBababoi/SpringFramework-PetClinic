package bababoi.springframework.springframeworkpetclinic.services;

import bababoi.springframework.springframeworkpetclinic.model.Owner;
import bababoi.springframework.springframeworkpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
