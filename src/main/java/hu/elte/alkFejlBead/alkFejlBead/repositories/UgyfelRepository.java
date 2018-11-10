package hu.elte.alkFejlBead.alkFejlBead.repositories;

import hu.elte.alkFejlBead.alkFejlBead.entities.Ugyfel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UgyfelRepository extends CrudRepository<Ugyfel, Integer> {
    Optional<Ugyfel> findByUserName(String username);
}
