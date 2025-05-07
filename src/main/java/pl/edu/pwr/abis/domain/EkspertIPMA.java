package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * Ekspert IPMA dokonujący Ocena Projektu
 */
@Entity
@Getter
@Setter
public class EkspertIPMA extends Osoba {

    @OneToMany
	Collection<PrzydzialAsesora> przydzialy;

    @NotNull
    @ManyToOne
    Organizacja afiliacja;

    @NotNull
	StanDanych stanDanych = StanDanych.DoWeryfikacji;

}
