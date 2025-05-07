package pl.edu.pwr.abis.domain;

@Entity
@Getter
@Setter
public class PrzydzialAsesora {

	Aplikacja przydzielonyProjekt;
	Aplikacja kierowanyProjekt;
	StanWspolpracyAsesora stanWspolpracy;
	String warunkiUmowy;
	Data dataZlozeniaPropozycji;

}
