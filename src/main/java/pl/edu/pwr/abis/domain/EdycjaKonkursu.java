package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


/**
 * Coroczna edycja Konkurs organizowana przez Biuro Nagrody
 */
@Entity
@Getter
@Setter
public class EdycjaKonkursu {

    @Id
    private Long id;

    @OneToMany
    Collection<Aplikacja> aplikacje;

    @OneToMany
	Collection<Wydarzenie> harmonogram;

    @OneToMany // TODO: OneToMany or ManyToMany
	Collection<KategoriaProjektu> kategorieProjektow;

    @OneToOne
	Plik listaFinalistow;

    @OneToOne
	Plik wyniki;

    @ManyToOne
	CzlonekBiuraNagrody przewodniczacyBiuraNagrody;

    @ManyToMany
    Collection<CzlonekBiuraNagrody> skladBiuraNagrody;

    @ManyToOne
    Jury przewodniczacyJury;

    @ManyToMany
    Collection<Jury> skladJury;

    @ManyToMany
    Collection<EkspertIPMA> eksperci;

    @OneToOne
    Plik regulamin;

    @NotNull
	Integer numerEdycji;

    @NotNull
	Integer rok;

    @NotNull
	StanEdycjiKonkursu stan = StanEdycjiKonkursu.Planowana;

    @NotNull
	Float kosztUczestnictwa;

    @NotNull
    Integer minLiczbaCzlonkowProjektu;

    @NotNull
    Integer minCzasTrwaniaProjektuMiesiące;

    @NotNull
    Integer minLiczbaPodwykonawców;

    @NotNull
    Integer maxCzasOdUkonczeniaProjektuMiesiące;

    @NotNull
    Data planowanaDataZlozeniaIO;

}
