package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OcenaCzlonkaJury {

    @NotNull
    @ManyToOne
	Aplikacja projekty;

    @NotNull
    Integer punkty;

}
