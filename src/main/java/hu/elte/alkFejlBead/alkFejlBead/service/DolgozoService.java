package hu.elte.alkFejlBead.alkFejlBead.service;

import hu.elte.alkFejlBead.alkFejlBead.Model.Dolgozo;
import hu.elte.alkFejlBead.alkFejlBead.repositories.DolgozoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Optional;

public class DolgozoService implements Serializable {

    @Autowired
    DolgozoRepository repository;

    public Iterable<Dolgozo> getAllDolgozo()  { return repository.findAll(); }

    public Optional<Dolgozo> getDolgozoById(Long id) { return repository.findById(id); }

    public void updateDolgozo(Dolgozo dolgozo) { repository.save(dolgozo); }

    public void addDijcsoamg(Dolgozo dolgozo) { repository.save(dolgozo); }
}
