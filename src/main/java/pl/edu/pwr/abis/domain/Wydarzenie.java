package pl.edu.pwr.abis.domain;

/**
 *  Zbiór informacji dotyczących terminów przebiegu Konkurs
 */
@Entity
@Getter
@Setter
public class Wydarzenie {

	String nazwa;
	TypWydarzenia typ;
    pl.edu.pwr.abis.domain.Data data;

}
