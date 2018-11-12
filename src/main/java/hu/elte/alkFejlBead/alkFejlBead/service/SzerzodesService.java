package hu.elte.alkFejlBead.alkFejlBead.service;

import hu.elte.alkFejlBead.alkFejlBead.Model.Szerzodes;
import hu.elte.alkFejlBead.alkFejlBead.repositories.SzerzodesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Optional;

@Service
public class SzerzodesService implements Serializable {

    @Autowired
    SzerzodesRepository repository;

    public Iterable<Szerzodes> getAllSzerzodes()  { return repository.findAll(); }

    public Optional<Szerzodes> getSzerzodesById(Long id) { return repository.findById(id); }

    public void update(Szerzodes szerzodes, Long id) {
        Optional<Szerzodes> szerzodes1 = repository.findById(id);
        if (szerzodes1.isPresent()) {
            repository.save(szerzodes);
        }
    }

    public void create(Szerzodes szerzodes) {
        if (!repository.findById(szerzodes.getId()).isPresent()) {
            repository.save(szerzodes);
        }
    }

    public void delete(Long id) {
        Optional<Szerzodes> szerzodes = repository.findById(id);
        if (szerzodes.isPresent()) repository.delete(szerzodes.get());

    }
}
