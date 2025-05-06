package ModelInformacyjnySystemu;

public abstract class Raport {

	Aplikacja aplikacja;
	StanRaportu stan = ModelInformacyjnySystemu.StanRaportu.WersjaRobocza;
	Data dataZlozenia;
	Data planowanaDataZlozenia;
	Boolean czyOpozniony;
	String komentarz;

}