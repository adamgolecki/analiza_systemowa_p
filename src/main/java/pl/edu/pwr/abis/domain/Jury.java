package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Jury extends Uzytkownik {

    @OneToMany
	Collection<EdycjaKonkursu> edycjePrzewodniczacego;

    @OneToMany
    Collection<EdycjaKonkursu> edycje;

    @OneToMany
    Collection<OcenaCzlonkaJury> ocenaCzlonkaJury;

}
