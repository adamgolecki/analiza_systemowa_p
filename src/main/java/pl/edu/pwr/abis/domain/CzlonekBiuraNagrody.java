package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CzlonekBiuraNagrody extends Uzytkownik {

    @OneToMany
	Collection<EdycjaKonkursu> edycjePrzewodniczacego;

    @ManyToMany
    Collection<EdycjaKonkursu> edycje;

}
