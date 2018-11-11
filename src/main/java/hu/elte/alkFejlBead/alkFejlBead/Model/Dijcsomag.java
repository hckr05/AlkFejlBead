package hu.elte.alkFejlBead.alkFejlBead.Model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;



@Table(name = "dijcsomag")
@Entity
public class Dijcsomag {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long  id;

    @NotEmpty
    private String nev;

    @NotEmpty
    private int havidij;

    public Dijcsomag() {
    }

    public Dijcsomag(String nev, int havidij) {
        this.nev = nev;
        this.havidij = havidij;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getHavidij() {
        return havidij;
    }

    public void setHavidij(int havidij) {
        this.havidij = havidij;
    }

    @Override
    public String toString() {
        return "Dijcsomag{" +
                "nev='" + nev + '\'' +
                ", havidij=" + havidij +
                '}';
    }
}
