package ModelInformacyjnySystemu;

import java.util.*;

/**
 * Proces zgłaszania Projekt do Konkurs
 */
public class Aplikacja {

	Organizacja organizacja;
	Collection<FormularzOcenyIndywidualnej> formularzeocenIndywidualnych;
	Collection<Asesor> asesorzy;
	Ocena raportOcenyWstepnej;
	Osoba osobaKontakowa;
	Organizacja organizacjaInicjujaca;
	Plik listReferencyjny;
	Collection<Plik> zdjecia;
	Collection<Plik> logotypy;
	Plik film;
	Plik oswiadczenieAplikanta;
	Plik oswiadczeznieInicjatora;
	Adres miejsceWizytyStudyjnej;
	PrzydziałAsesora asesorWiodacy;
	Collection<PrzydziałAsesora> przydzieleniAsesorowie;
	Ocena raportOcenyKoncowej;
	Raport raportWizytyStudyjnej;
	Integer numerAplikacji;
	Data dataZlozenia;
	StanAplikacji stan;
	String powodOdrzucenia;
	StanOpłaty stanOplaty;
	WynikAplikacji wynik;
	String nazwaProjektu;
	String opisProjektu;
	Integer czasTrwaniaMiesiace;
	Integer liczbaCzlonkow;
	Integer budzet;
	Integer liczbaPodwykonawców;
	Boolean czyZgodnyZDefinicja;
	Boolean czyPublikowalny;
	Boolean czyUkonczony;
	Data dataZakonczenia;
	FazaOceny fazaOceny;
	Real sredniaOcenaJury;

}