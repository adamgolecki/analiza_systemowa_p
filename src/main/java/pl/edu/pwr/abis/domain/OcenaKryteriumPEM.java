package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OcenaKryteriumPEM {

    @NotNull
	Integer liczbaPunktow;

    @NotNull
    String uzasadnienie;

}
