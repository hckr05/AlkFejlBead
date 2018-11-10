package hu.elte.alkFejlBead.alkFejlBead.Model;


import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
public class Dolgozo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String vezNev;

    private  String kerNev;

    private String telefon;

    @OneToMany
    private Integer hozzatartozoSzerzodesId;



}
