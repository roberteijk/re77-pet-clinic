/**
 * Created by Robert van den Eijk on 8-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "vets/index.html"})
    public String listVets() {
        return "vet/index";
    }
}
