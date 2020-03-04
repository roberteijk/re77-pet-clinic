/**
 * Created by Robert van den Eijk on 4-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.service;

import net.vandeneijk.learn.re77petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();
}
