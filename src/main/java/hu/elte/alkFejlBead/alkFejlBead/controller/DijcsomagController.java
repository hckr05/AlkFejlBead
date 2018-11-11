package hu.elte.alkFejlBead.alkFejlBead.controller;


import hu.elte.alkFejlBead.alkFejlBead.Model.Dijcsomag;
import hu.elte.alkFejlBead.alkFejlBead.service.DijcsomagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dijcsomagok")
public class DijcsomagController {

    @Autowired
    private DijcsomagService dijcsomagService;

    //
    @GetMapping("/all")
    public Iterable<Dijcsomag> all(){return dijcsomagService.getAllDijcsomag();}




}