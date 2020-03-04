/**
 * Created by Robert van den Eijk on 2-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.model;

public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
