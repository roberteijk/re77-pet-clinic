/**
 * Created by Robert van den Eijk on 8-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.service.map;

import net.vandeneijk.learn.re77petclinic.model.Pet;
import net.vandeneijk.learn.re77petclinic.service.PetService;

import java.util.Set;

public class PetServiceMap extends ServiceMap<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
