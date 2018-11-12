package hu.elte.alkFejlBead.alkFejlBead.security;

import hu.elte.alkFejlBead.alkFejlBead.Model.Felhasznalo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutenticatedFelhasznalo {
    private Felhasznalo felhasznalo;

    public Felhasznalo getFelhasznalo() {
        return felhasznalo;
    }

    public void setFelhasznalo(Felhasznalo felhasznalo) {
        this.felhasznalo = felhasznalo;
    }
}
