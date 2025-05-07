package pl.edu.pwr.abis.domain;

/**
 * Raport składany przez Aplikant w Formularz Zgłoszeniowy dotyczący szczegółów Projekt oraz zarządzania nim - musi być dostarczony osobno od Formularz zgłoszeniowy do daty określonej w Harmonogram
 */
@Entity
@Getter
@Setter
public class RaportAplikacyjny {

	StanRaportuAplikacyjnego stan;
	Data dataZlozenia;
	String powodOdrzucenia;

}
