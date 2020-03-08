/**
 * Created by Robert van den Eijk on 6-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class ServiceMap<T, Id> {

    protected Map<Id, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(Id id) {
        return map.get(id);
    }

    T save(Id id, T object) {
        map.put(id, object);
        return object;
    }

    void deleteById(Id id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
