package hu.elte.alkFejlBead.alkFejlBead.Model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ugyfel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String vezNev;

    private String kerNev;

    private String email;

    @OneToOne
    private Integer hozzatartozoDolgozoId;

    @OneToMany
    private Integer szerzodesId;

}
