package hu.elte.alkFejlBead.alkFejlBead.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Table(name = "dolgozo")
@Entity
public class Dolgozo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotEmpty
    private String vezNev;

    @NotEmpty
    private  String kerNev;

    @NotEmpty
    private String telefon;

    @NotEmpty
    private String jelszo;

    @NotEmpty
    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        ROLE_DOLGOZO, ROLE_ADMIN
    }

    @OneToMany(mappedBy = "dolgozo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Szerzodes> szerzodes;

    public Dolgozo(@NotEmpty String vezNev, @NotEmpty String kerNev, @NotEmpty String telefon, List<Szerzodes> szerzodes) {
        this.vezNev = vezNev;
        this.kerNev = kerNev;
        this.telefon = telefon;
        this.szerzodes = szerzodes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJelszo() {
        return jelszo;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setJelszo(String jelszo) {
        this.jelszo = jelszo;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public List<Szerzodes> getSzerzodes() {
        return szerzodes;
    }

    public void setSzerzodes(List<Szerzodes> szerzodes) {
        this.szerzodes = szerzodes;
    }

    @Override
    public String toString() {
        return "Dolgozo{" +
                "id=" + id +
                ", vezNev='" + vezNev + '\'' +
                ", kerNev='" + kerNev + '\'' +
                ", telefon='" + telefon + '\'' +
                ", szerzodes=" + szerzodes +
                '}';
    }
}
