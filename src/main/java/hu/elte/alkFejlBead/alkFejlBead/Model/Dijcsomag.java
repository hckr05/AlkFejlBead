package hu.elte.alkFejlBead.alkFejlBead.Model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class Dijcsomag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer DijcsomagId;


    private String nev;



    private int havidij;


}
