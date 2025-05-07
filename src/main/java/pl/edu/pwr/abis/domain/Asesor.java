package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Asesor extends Uzytkownik {

    @NotNull
    @ManyToOne
    EkspertIPMA ekspertIPMA;

    @OneToMany
	Collection<FormularzOcenyIndywidualnej> formularze;

    @OneToOne(optional = false)
    Aplikacja aplikacja;

    @NotNull
	String imie = ekspertIPMA.imie;

    @NotNull
    String nazwisko = ekspertIPMA.nazwisko;

    @NotNull
    String telefon = ekspertIPMA.telefon;

    @NotNull
    String email = ekspertIPMA.email;

}
