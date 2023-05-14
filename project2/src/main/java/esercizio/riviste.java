package esercizio;



import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class riviste  extends ElementoBiblioteca {

	private Periodicità periodicita;
	
	public riviste(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicità periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}
	
	public Periodicità getPeriodicita() {
		return periodicita;
	}
	

}
