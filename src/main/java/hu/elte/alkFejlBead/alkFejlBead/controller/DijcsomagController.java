package hu.elte.alkFejlBead.alkFejlBead.controller;


import hu.elte.alkFejlBead.alkFejlBead.entities.Dijcsomag;
import hu.elte.alkFejlBead.alkFejlBead.repositories.DijcsomagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/dijcsomagok")
public class DijcsomagController {

    @Autowired
    private DijcsomagController dijcsomagController;

    @GetMapping("/")
    ResponseEntity<Iterable<Dijcsomag>> getAllDijcsomag() {
        return ResponseEntity.ok(DijcsomagRepository.findAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<Dijcsomag> get(@PathVariable Integer id) {
        Optional<Dijcsomag> dijcsomag = DijcsomagRepository.findById(id);
        if (dijcsomag.isPresent()) {
            return ResponseEntity.ok(dijcsomag.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}