/**
 * Created by Robert van den Eijk on 4-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.service;

import net.vandeneijk.learn.re77petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
