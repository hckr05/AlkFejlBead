package hu.elte.alkFejlBead.alkFejlBead.Model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Table(name = "poszt")
@Entity
public class Poszt {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotEmpty
    private String nev;

    @NotEmpty
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Szerzodes> szerzodes;
}
