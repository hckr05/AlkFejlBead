package hu.elte.alkFejlBead.alkFejlBead.controller;


import hu.elte.alkFejlBead.alkFejlBead.Model.Felhasznalo;
import hu.elte.alkFejlBead.alkFejlBead.repositories.FelhasznaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/felhasznalo")
public class FelhasznaloController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private FelhasznaloRepository felhasznaloRepository;

    @PostMapping("/regisztracio")
    public ResponseEntity<Felhasznalo> regisztracio(@RequestBody Felhasznalo felhasznalo) {
        Optional<Felhasznalo> oUser = felhasznaloRepository.findByNev(felhasznalo.getNev());
        if (oUser.isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        felhasznalo.setJelszo(passwordEncoder.encode(felhasznalo.getJelszo()));
        felhasznalo.setAktiv(true);
        felhasznalo.setRole(Felhasznalo.Role.ROLE_UGYFEL);
        return ResponseEntity.ok(felhasznaloRepository.save(felhasznalo));
    }


    @PostMapping("/belepes")
    public ResponseEntity belepes(@RequestBody Felhasznalo felhasznalo) {
        return ResponseEntity.ok().build();
    }

}
