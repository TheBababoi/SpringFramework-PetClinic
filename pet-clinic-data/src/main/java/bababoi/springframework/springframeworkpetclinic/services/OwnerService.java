package bababoi.springframework.springframeworkpetclinic.services;

import bababoi.springframework.springframeworkpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastname);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
