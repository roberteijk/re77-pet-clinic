/**
 * Created by Robert van den Eijk on 4-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.service;

import net.vandeneijk.learn.re77petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}
