package pl.edu.pwr.abis.domain;

@Entity
@Getter
@Setter
public class Uzytkownik extends Osoba {

	String login;
	StanKonta stanKonta;

}
