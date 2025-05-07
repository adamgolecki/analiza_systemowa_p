package pl.edu.pwr.abis.domain;

public abstract class Raport {

	Aplikacja aplikacja;
	StanRaportu stan = pl.edu.pwr.abis.domain.StanRaportu.WersjaRobocza;
	Data dataZlozenia;
	Data planowanaDataZlozenia;
	Boolean czyOpozniony;
	String komentarz;

}
