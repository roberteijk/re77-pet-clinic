/**
 * Created by Robert van den Eijk on 6-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.service.map;

import net.vandeneijk.learn.re77petclinic.model.Owner;
import net.vandeneijk.learn.re77petclinic.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends ServiceMap<Owner, Long> implements OwnerService {

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
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
