package hu.elte.alkFejlBead.alkFejlBead.security;

import hu.elte.alkFejlBead.alkFejlBead.Model.Felhasznalo;
import hu.elte.alkFejlBead.alkFejlBead.repositories.FelhasznaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private FelhasznaloRepository repository;

    @Autowired
    private AutenticatedFelhasznalo authenticated;

    @Override
    @Transactional()
    public UserDetails loadUserByUsername(String nev) throws UsernameNotFoundException {
        Optional<Felhasznalo> oUser = repository.findByNev(nev);
        if (!oUser.isPresent()) {
            throw new UsernameNotFoundException(nev);
        }
        Felhasznalo felhasznalo = oUser.get();
        authenticated.setFelhasznalo(felhasznalo);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(felhasznalo.getRole().toString()));

        return new org.springframework.security.core.userdetails.User(felhasznalo.getNev(), felhasznalo.getJelszo(),
                grantedAuthorities);
    }
}