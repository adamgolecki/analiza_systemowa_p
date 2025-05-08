package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Getter
@Setter
public class PrzydzialAsesora {

    @ManyToOne
	Aplikacja przydzielonyProjekt;
    @OneToOne
	Aplikacja kierowanyProjekt;
	StanWspolpracyAsesora stanWspolpracy;
	String warunkiUmowy;
	Data dataZlozeniaPropozycji;

}
