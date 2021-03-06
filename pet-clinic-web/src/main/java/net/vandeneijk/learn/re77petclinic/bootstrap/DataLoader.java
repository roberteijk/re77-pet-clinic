/**
 * Created by Robert van den Eijk on 10-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.bootstrap;

import net.vandeneijk.learn.re77petclinic.model.Owner;
import net.vandeneijk.learn.re77petclinic.model.Vet;
import net.vandeneijk.learn.re77petclinic.service.OwnerService;
import net.vandeneijk.learn.re77petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded owners (sample)...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Erica");
        vet2.setLastName("Blitz");
        vetService.save(vet2);

        System.out.println("Loaded vets (sample)...");
    }
}
