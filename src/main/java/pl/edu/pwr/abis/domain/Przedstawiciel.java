package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Getter
@Setter
public class Przedstawiciel extends Uzytkownik {
    @OneToOne
    Collection<Organizacja> organizacja;
}
