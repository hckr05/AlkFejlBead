package hu.elte.alkFejlBead.alkFejlBead.service;

import hu.elte.alkFejlBead.alkFejlBead.Model.Dijcsomag;
import hu.elte.alkFejlBead.alkFejlBead.repositories.DijcsomagRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Optional;

public class DijcsomagService implements Serializable {

    @Autowired
    DijcsomagRepository repository;

    public Iterable<Dijcsomag> getAllDijcsomag()  { return repository.findAll(); }

    public Optional<Dijcsomag> getDijcsomagById(Long id) { return repository.findById(id); }

    public void updateDijcsomag(Dijcsomag dijcsomag) { repository.save(dijcsomag); }

    public void addDijcsoamg(Dijcsomag dijcsomag) { repository.save(dijcsomag); }
}
