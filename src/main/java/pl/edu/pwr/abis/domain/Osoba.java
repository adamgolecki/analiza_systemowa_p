package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Getter
@Setter
public class Osoba {

    @OneToMany
    Collection<Email> emails;

    @OneToMany
    Collection<Webinarium> webinarium;

    @OneToOne
    Collection<Organizacja> orgazniazacja;

	String imie;
	String nazwisko;
	String telefon;
	String email;

}
