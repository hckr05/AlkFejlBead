package hu.elte.alkFejlBead.alkFejlBead.service;

import hu.elte.alkFejlBead.alkFejlBead.Model.Ugyfel;
import hu.elte.alkFejlBead.alkFejlBead.repositories.UgyfelRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Optional;

public class UgyfelService implements Serializable {

    @Autowired
    UgyfelRepository repository;

    public Iterable<Ugyfel> getAllUgyfel()  { return repository.findAll(); }

    public Optional<Ugyfel> getUgyfelById(Long id) { return repository.findById(id); }

    public void updateUgyfel(Ugyfel ugyfel) { repository.save(ugyfel); }

    public void addUgyfel(Ugyfel ugyfel) { repository.save(ugyfel); }
}
