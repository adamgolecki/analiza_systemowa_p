package ModelInformacyjnySystemu;

import java.util.*;
import TypyDanych.*;

/**
 * Coroczna edycja Konkurs organizowana przez Biuro Nagrody
 */
public class EdycjaKonkursu {

	Collection<Aplikacja> aplikacje;
	Collection<Wydarzenie> harmonogram;
	Collection<KategoriaProjektu> kategorieProjektow;
	Plik listaFinalistow;
	Plik wyniki;
	CzlonekBiuraNagrody przewodniczacyBiuraNagrody;
	Collection<CzlonekBiuraNagrody> skladBiuraNagrody;
	Jury przewodniczacyJury;
	Collection<Jury> skladJury;
	Collection<EkspertIPMA> eksperci;
	Plik regulamin;
	Integer numerEdycji;
	Integer rok;
	StanEdycjiKonkursu stan;
	Real kosztUczestnictwa;
	Integer minLiczbaCzlonkowProjektu;
	Integer minCzasTrwaniaProjektuMiesiące;
	Integer minLiczbaPodwykonawców;
	Integer maxCzasOdUkonczeniaProjektuMiesiące;
	Date planowanaDataZlozeniaIO;

}