package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Organizacja {

    @OneToMany
	Collection<Aplikacja> aplikacjeZainicjowane;

    @OneToMany
    Collection<Aplikacja> aplikacje;

    @NotNull
    @OneToOne
    Osoba zarzadca;
	Przedstawiciel przedstawiciel;
	String nip;
	String nazwa;
	String email;
	StanDanych stanDanych;
	Boolean czyPowiazanyZIPMA = False;
	String skrotNazwy;
	String nazwaNaFakturze;

}
