/**
 * Created by Robert van den Eijk on 4-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
