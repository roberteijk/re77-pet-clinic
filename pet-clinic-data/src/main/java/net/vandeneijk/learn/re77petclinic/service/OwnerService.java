/**
 * Created by Robert van den Eijk on 4-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.service;

import net.vandeneijk.learn.re77petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save (Owner owner);

    Set<Owner> findAll();
}
