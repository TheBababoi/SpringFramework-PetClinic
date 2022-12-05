package bababoi.springframework.springframeworkpetclinic.services.map;

import bababoi.springframework.springframeworkpetclinic.model.Owner;
import bababoi.springframework.springframeworkpetclinic.services.CrudService;

import java.util.Set;

public class OwnerMapSerivce extends  AbstractMapService<Owner,Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
