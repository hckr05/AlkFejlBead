package hu.elte.alkFejlBead.alkFejlBead.repositories;

import hu.elte.alkFejlBead.alkFejlBead.Model.Felhasznalo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface  FelhasznaloRepository extends CrudRepository<Felhasznalo, Long> {

    Optional<Felhasznalo> findByNev(String nev);

}
