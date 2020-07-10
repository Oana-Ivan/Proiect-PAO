package clase;

public class CarteStiintifica extends Carte{
    private int nrTermeniIndex;
    private int nrSurseBibliografice;

    public CarteStiintifica() {
        super();
        this.nrTermeniIndex = 0;
        this.nrSurseBibliografice = 0;
    }
    public CarteStiintifica(String autor, String titlu, int ISBN, int nrTermeniIndex, int nrSurseBibliografice) {
        super(autor, titlu, ISBN);
        this.nrTermeniIndex = nrTermeniIndex;
        this.nrSurseBibliografice = nrSurseBibliografice;
    }
    @Override
    public void afisareDate() {
        System.out.println("Titlu carte stiintifica: " + this.getTitlu());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("ISBN: " + this.getISBN());
        System.out.println("Nr termeni in index: " + nrTermeniIndex);
        System.out.println("Nr surse bibliografice: " + nrSurseBibliografice);
        System.out.println("Nr imprumuturi " + this.getNrInprumutari());
    }
    // metode get
    public int getNrTermeniIndex() {
        return nrTermeniIndex;
    }
    public int getNrSurseBibliografice() {
        return nrSurseBibliografice;
    }

    // metode set
    public void setNrTermeniIndex(int nr) {
        nrTermeniIndex = nr;
    }
    public void setNrSurseBibliografice(int nr) {
        nrSurseBibliografice = nr;
    }
}
