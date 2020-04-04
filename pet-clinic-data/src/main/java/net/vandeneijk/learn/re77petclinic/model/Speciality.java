/**
 * Created by Robert van den Eijk on 4-4-2020.
 */

package net.vandeneijk.learn.re77petclinic.model;

public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
