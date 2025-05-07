package pl.edu.pwr.abis.domain;

import java.util.*;

@Entity
@Getter
@Setter
public class Pytanie {

	Collection<Plik> zalacznik;
	String tresc;
	String odpowiedź;

}
