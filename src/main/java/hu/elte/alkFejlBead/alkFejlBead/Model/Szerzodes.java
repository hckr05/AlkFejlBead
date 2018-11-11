package hu.elte.alkFejlBead.alkFejlBead.Model;

import lombok.Data;

import javax.persistence.*;
//import java.sql.Date;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "szerzodes")
public class Szerzodes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private Ugyfel ugyfel;

    @ManyToOne
    @JoinColumn
    private Dolgozo dolgozo;

    @OneToOne
    private Dijcsomag dijcsomag;

    private Date lejarat;

    @ManyToMany(mappedBy = "szoveg", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Poszt> poszt;

    public Szerzodes(Ugyfel ugyfel, Dolgozo dolgozo, Dijcsomag dijcsomag, Date lejarat) {
        this.ugyfel = ugyfel;
        this.dolgozo = dolgozo;
        this.dijcsomag = dijcsomag;
        this.lejarat = lejarat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ugyfel getUgyfel() {
        return ugyfel;
    }

    public void setUgyfel(Ugyfel ugyfel) {
        this.ugyfel = ugyfel;
    }

    public Dolgozo getDolgozo() {
        return dolgozo;
    }

    public void setDolgozo(Dolgozo dolgozo) {
       this.dolgozo = dolgozo;
    }

    public Dijcsomag getDijcsomag() {
        return dijcsomag;
    }

    public void setDijcsomag(Dijcsomag dijcsomag) {
        this.dijcsomag = dijcsomag;
    }

    public Date getLejarat() {
        return lejarat;
    }

    public void setLejarat(Date lejarat) {
        this.lejarat = lejarat;
    }

    @Override
    public String toString() {
        return "Szerzodes{" +
                "id=" + id +
                ", ugyfel=" + ugyfel +
                ", dolgozo=" + dolgozo +
                ", dijcsomag=" + dijcsomag +
                ", lejarat=" + lejarat +
                '}';
    }
}
