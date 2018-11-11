package hu.elte.alkFejlBead.alkFejlBead.service;

import hu.elte.alkFejlBead.alkFejlBead.Model.Poszt;
import hu.elte.alkFejlBead.alkFejlBead.Model.Szerzodes;
import hu.elte.alkFejlBead.alkFejlBead.repositories.PosztRepository;
import hu.elte.alkFejlBead.alkFejlBead.repositories.SzerzodesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Optional;

public class SzerzodesService implements Serializable {

    @Autowired
    SzerzodesRepository repository;

    public Iterable<Szerzodes> getAllSzerzodes()  { return repository.findAll(); }

    public Optional<Szerzodes> getSzerzodesById(Long id) { return repository.findById(id); }

    public void updateSzerzodes(Szerzodes szerzodes) { repository.save(szerzodes); }

    public void addPoszt(Szerzodes szerzodes) { repository.save(szerzodes); }
}
