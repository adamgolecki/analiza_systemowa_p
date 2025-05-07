package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Data {

    @NotNull
	Integer rok;

    @NotNull
	Integer miesiac;

    @NotNull
	Integer dzien;

}
