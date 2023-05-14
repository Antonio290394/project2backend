package esercizio;

public class ElementoBiblioteca {

	protected String codiceISBN;
	protected String titolo;
	protected int annoPubblicazione;
	protected int numeroPagine;
	
	public ElementoBiblioteca(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine) {
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}
	
	public String getCodiceISBN() {
		return codiceISBN;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	
	public int getNumeroPagine() {
		return numeroPagine;
	}
	
}