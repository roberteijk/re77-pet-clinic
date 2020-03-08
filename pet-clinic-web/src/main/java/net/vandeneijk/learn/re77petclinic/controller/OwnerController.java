/**
 * Created by Robert van den Eijk on 8-3-2020.
 */

package net.vandeneijk.learn.re77petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners() {
        return "owner/index";
    }
}
