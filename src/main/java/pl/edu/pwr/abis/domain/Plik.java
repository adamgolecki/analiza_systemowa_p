package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Plik {

    @ManyToOne
    Collection<Pytanie> pytanie;

    @OneToOne
    Collection<EdycjaKonkursu> edycjaKonkursu;

    @OneToOne
    Collection<Aplikacja> aplikacja;

	Data dataUtworzenia;
	String nazwa;
	String typ;
	String sciezka;

}
