package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PosiedzenieJury extends WydarzenieMiejscowe {

	TypWydarzenia typ = pl.edu.pwr.abis.domain.TypWydarzenia.PosiedzenieJury;
	String opis;

}
