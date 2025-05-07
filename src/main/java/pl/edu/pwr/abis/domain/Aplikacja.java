package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * Proces zgłaszania Projekt do Konkurs
 */
@Entity
@Getter
@Setter
public class Aplikacja {

	@ManyToOne(optional = false)
    EdycjaKonkursu edycjaKonkursu;

    @ManyToOne(optional = false)
    Organizacja organizacja;

    @OneToMany
    Collection<FormularzOcenyIndywidualnej> formularzeocenIndywidualnych;

    @ManyToMany
    Collection<Asesor> asesorzy;

    @OneToOne
	Ocena raportOcenyWstepnej;

    @NotNull
    Osoba osobaKontakowa;

    @ManyToOne
    Organizacja organizacjaInicjujaca;

    @OneToOne
    Plik listReferencyjny;

    @ManyToOne
    Collection<Plik> zdjecia;

    @ManyToOne
    Collection<Plik> logotypy;

    @OneToOne
    Plik film;

    @OneToOne
    Plik oswiadczenieAplikanta;

    @OneToOne
    Plik oswiadczeznieInicjatora;

    @OneToOne
    Adres miejsceWizytyStudyjnej;

    @OneToMany
    PrzydzialAsesora asesorWiodacy;

    @OneToMany
    Collection<PrzydzialAsesora> przydzieleniAsesorowie;

    @OneToOne
    Ocena raportOcenyKoncowej;

    @OneToOne
    Raport raportWizytyStudyjnej;

    @NotNull
    Integer numerAplikacji;

    @OneToOne
    Data dataZlozenia;

    @NotNull
    @OneToOne
	StanAplikacji stan = StanAplikacji.Nierozpatrzona;

	String powodOdrzucenia;

    @NotNull
	StanOplaty stanOplaty = StanOplaty.Niepokryta;

	WynikAplikacji wynik;

    @NotNull
    String nazwaProjektu;

    @NotNull
    String opisProjektu;

    @NotNull
    Integer czasTrwaniaMiesiace;

    @NotNull
    Integer liczbaCzlonkow;

    @NotNull
    Integer budzet;

    @NotNull
    Integer liczbaPodwykonawcow;

    @NotNull
    Boolean czyZgodnyZDefinicja;

    @NotNull
    Boolean czyPublikowalny;

    @NotNull
    Boolean czyUkonczony;

    @OneToOne(optional = false)
    Data dataZakonczenia;

    @OneToOne
	FazaOceny fazaOceny;

    Float sredniaOcenaJury;

}
