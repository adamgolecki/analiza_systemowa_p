package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * Podsumowanie Ocena indywidualna przesyłane do Biuro Nagrody
 */
@Entity
@Getter
@Setter
public class FormularzOcenyIndywidualnej extends Ocena {

	@NotNull
    Data planowanaDataZlozenia = this.aplikacja.edycjaKonkursu.planowanaDataZlozeniaIO;

}
