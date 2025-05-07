package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Adres {

    @NotNull
	String kraj;

    @NotNull
    String wojewodztwo;

    @NotNull
    String miasto;

    @NotNull
    String ulica;

    @NotNull
    String kodPocztowy;

}
