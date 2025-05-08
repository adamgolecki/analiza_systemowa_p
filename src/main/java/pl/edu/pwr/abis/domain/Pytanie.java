package pl.edu.pwr.abis.domain;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pytanie {

    @ManyToOne
	Collection<Plik> zalacznik;
	String tresc;
	String odpowiedź;

}
