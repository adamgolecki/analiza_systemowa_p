package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

/**
 * Raport składany przez Aplikant w Formularz Zgłoszeniowy dotyczący szczegółów Projekt oraz zarządzania nim - musi być dostarczony osobno od Formularz zgłoszeniowy do daty określonej w Harmonogram
 */
@Entity
@Getter
@Setter
public class RaportAplikacyjny {

    @OneToOne
    Collection<Aplikacja> aplikacja;

	StanRaportuAplikacyjnego stan;
	Data dataZlozenia;
	String powodOdrzucenia;

}
