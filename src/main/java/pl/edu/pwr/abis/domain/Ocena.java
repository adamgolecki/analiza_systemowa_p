package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * Podsumowanie odpowiedzi na pytania Jury Nagrody przesyłane do Biuro Nagrody
 */
@Entity
@Getter
@Setter
public class Ocena extends Raport {

    @OneToMany
    Collection<OcenaKryteriumPEM> ocenyKryteriow;

    @NotNull
	Integer lacznaLiczbaPunktow;

}
