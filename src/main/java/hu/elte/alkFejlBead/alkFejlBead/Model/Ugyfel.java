package hu.elte.alkFejlBead.alkFejlBead.Model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Table(name = "ugyfel")
@Entity
public class Ugyfel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotEmpty
    private String vezNev;

    @NotEmpty
    private String kerNev;

    @NotEmpty
    private String email;

    @OneToOne
    private Dolgozo dolgozo;

    @OneToOne
    private Szerzodes szerzodes;

    public Ugyfel(String vezNev, String kerNev, String email, Dolgozo dolgozo, Szerzodes szerzodes) {
        this.vezNev = vezNev;
        this.kerNev = kerNev;
        this.email = email;
        this.dolgozo = dolgozo;
        this.szerzodes = szerzodes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVezNev() {
        return vezNev;
    }

    public void setVezNev(String vezNev) {
        this.vezNev = vezNev;
    }

    public String getKerNev() {
        return kerNev;
    }

    public void setKerNev(String kerNev) {
        this.kerNev = kerNev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dolgozo getDolgozo() {
        return dolgozo;
    }

    public void setDolgozo(Dolgozo dolgozo) {
        this.dolgozo = dolgozo;
    }

    public Szerzodes getSzerzodes() {
        return szerzodes;
    }

    public void setSzerzodes(Szerzodes szerzodesId) {
        this.szerzodes = szerzodes;
    }

    @Override
    public String toString() {
        return "Ugyfel{" +
                "id=" + id +
                ", vezNev='" + vezNev + '\'' +
                ", kerNev='" + kerNev + '\'' +
                ", email='" + email + '\'' +
                ", dolgozo=" + dolgozo +
                ", szerzodes=" + szerzodes +
                '}';
    }
}
