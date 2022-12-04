package bababoi.springframework.springframeworkpetclinic.services;

import bababoi.springframework.springframeworkpetclinic.model.Owner;
import bababoi.springframework.springframeworkpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
