package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Email {

    @NotNull
	Osoba nadawca;

    @NotNull
	Collection<Osoba> odbiorca;

    @NotNull
	String temat;

    @NotNull
	String tresc;

}
