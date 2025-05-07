package pl.edu.pwr.abis.domain;

/**
 * Wydarzenie dla Potencjalnych Aplikant, Ekspert IPMA oraz Aplikant
 */
@Entity
@Getter
@Setter
public class Webinarium extends Wydarzenie {

	Osoba trener;
	static int typ = Webinarium;
	TypWebinarium typWebinarium;

}
