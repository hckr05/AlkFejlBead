package hu.elte.alkFejlBead.alkFejlBead.Model;

import lombok.Data;

import javax.persistence.*;
//import java.data.sql.Date;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "szerzodes")
public class Szerzodes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private Dijcsomag dijcsomag;

    @OneToOne
    private Felhasznalo dolgozo;

    @OneToOne
    private Felhasznalo ugyfel;

    private Date lejarat;

    @ManyToMany(mappedBy = "szerzodes", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Poszt> poszt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dijcsomag getDijcsomag() {
        return dijcsomag;
    }

    public void setDijcsomag(Dijcsomag dijcsomag) {
        this.dijcsomag = dijcsomag;
    }

    public Felhasznalo getDolgozo() {
        return dolgozo;
    }

    public void setDolgozo(Felhasznalo dolgozo) {
        this.dolgozo = dolgozo;
    }

    public Felhasznalo getUgyfel() {
        return ugyfel;
    }

    public void setUgyfel(Felhasznalo ugyfel) {
        this.ugyfel = ugyfel;
    }

    public Date getLejarat() {
        return lejarat;
    }

    public void setLejarat(Date lejarat) {
        this.lejarat = lejarat;
    }

    public List<Poszt> getPoszt() {
        return poszt;
    }

    public void setPoszt(List<Poszt> poszt) {
        this.poszt = poszt;
    }

    @Override
    public String toString() {
        return "Szerzodes{" +
                "id=" + id +
                ", dijcsomag=" + dijcsomag +
                ", dolgozo=" + dolgozo +
                ", ugyfel=" + ugyfel +
                ", lejarat=" + lejarat +
                ", poszt=" + poszt +
                '}';
    }
}
