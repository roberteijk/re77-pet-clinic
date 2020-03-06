/**
 * Created by Robert van den Eijk on 6-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.service;

import java.util.Set;

public interface CrudService<T, Id> {

    Set<T> findAll();

    T findById(Id id);

    T save(T object);

    void delete(T object);

    void deleteById(Id id);
}
