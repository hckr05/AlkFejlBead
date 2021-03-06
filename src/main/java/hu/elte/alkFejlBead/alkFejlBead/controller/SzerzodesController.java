package hu.elte.alkFejlBead.alkFejlBead.controller;

import hu.elte.alkFejlBead.alkFejlBead.Model.Szerzodes;
import hu.elte.alkFejlBead.alkFejlBead.service.SzerzodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/szerzodes")
public class SzerzodesController {

    @Autowired
    private SzerzodesService service;

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/all")
    public Iterable<Szerzodes> getAll() {
        return service.getAllSzerzodes();
    }

    @GetMapping("{id}")
    public Optional<Szerzodes> get(@PathVariable Long id) {
        return service.getSzerzodesById(id);
    }

    @PutMapping("{id}")
    public void put(@RequestBody Szerzodes szerzodes, @PathVariable long id){
        service.update(szerzodes, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping("")
    public void  post(@RequestBody Szerzodes szerzodes) {
        service.create(szerzodes);
    }

}
