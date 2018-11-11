package hu.elte.alkFejlBead.alkFejlBead.controller;

import hu.elte.alkFejlBead.alkFejlBead.Model.Poszt;
import hu.elte.alkFejlBead.alkFejlBead.service.PosztService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poszt")
public class PosztController {

    @Autowired
    private PosztService posztService;

    //
    @GetMapping("/all")
    public Iterable<Poszt> all(){return posztService.getAllPoszt();}
}
