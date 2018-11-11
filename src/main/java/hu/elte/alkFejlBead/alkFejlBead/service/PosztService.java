package hu.elte.alkFejlBead.alkFejlBead.service;

import hu.elte.alkFejlBead.alkFejlBead.Model.Poszt;
import hu.elte.alkFejlBead.alkFejlBead.repositories.PosztRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PosztService {

    @Autowired
    PosztRepository repository;

    public Iterable<Poszt> getAllPoszt()  { return repository.findAll(); }

    public Optional<Poszt> getPosztById(Long id) { return repository.findById(id); }

    public void updatePoszt(Poszt poszt) { repository.save(poszt); }

    public void addPoszt(Poszt poszt) { repository.save(poszt); }
}
