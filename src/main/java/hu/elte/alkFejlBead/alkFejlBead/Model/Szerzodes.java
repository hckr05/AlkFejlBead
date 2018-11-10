package hu.elte.alkFejlBead.alkFejlBead.Model;

import lombok.Data;

import javax.persistence.*;
//import java.sql.Date;
import java.util.Date;


@Entity
@Data


public class Szerzodes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @OneToOne
    private Integer ugyfelId;

    @OneToOne
    private Integer dolgozoId;

    @OneToOne
    private Integer dijcsomagId;

    private Date lejarat;
}
