/**
 * Created by Robert van den Eijk on 8-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.service.map;

import net.vandeneijk.learn.re77petclinic.model.Vet;
import net.vandeneijk.learn.re77petclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends ServiceMap<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }


}

