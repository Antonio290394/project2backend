package esercizio;



public class libri extends ElementoBiblioteca {

	private String autore;
	private String genere;
	
	public libri(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public String getGenere() {
		return genere;
	}
	


	
}
	
	

