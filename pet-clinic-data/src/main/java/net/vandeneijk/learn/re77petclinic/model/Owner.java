/**
 * Created by Robert van den Eijk on 2-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.model;

import java.util.Set;

public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
