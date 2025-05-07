package pl.edu.pwr.abis.domain;

@Entity
@Getter
@Setter
public class PosiedzenieJury extends WydarzenieMiejscowe {

	TypWydarzenia typ = pl.edu.pwr.abis.domain.TypWydarzenia.PosiedzenieJury;
	String opis;

}
