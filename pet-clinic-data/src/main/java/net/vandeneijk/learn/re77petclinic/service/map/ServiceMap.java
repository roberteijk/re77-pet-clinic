/**
 * Created by Robert van den Eijk on 6-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.service.map;

import net.vandeneijk.learn.re77petclinic.model.BaseEntity;

import java.util.*;

public abstract class ServiceMap<T extends BaseEntity, Id extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(Id id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null)
                object.setId((getNextId()));
            map.put(object.getId(), object);
        } else throw new IllegalArgumentException("Object cannot be null.");

        return object;
    }

    void deleteById(Id id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException nseEx) {
            nextId = 1L;
        }

        return nextId;
    }
}
