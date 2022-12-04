package bababoi.springframework.springframeworkpetclinic.services;

import bababoi.springframework.springframeworkpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastname);}

