package clase;

public class Carte {
    private String numeAutor;
    private String titlu;
    private int ISBN;
    private int nrInprumutari;

    public Carte () {
        this.numeAutor = "";
        this.titlu = "";
        this.ISBN = 0;
        this.nrInprumutari = 0;
    }
    public Carte (String numeAutor, String titlu, int ISBN) {
        this.numeAutor = numeAutor;
        this.titlu = titlu;
        this.ISBN = ISBN;
        this.nrInprumutari = 0;
    }
    public void afisareDate() {
        System.out.println("Titlu: " + this.titlu);
        System.out.println("Autor: " + this.numeAutor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Nr imprumuturi: " + this.nrInprumutari);
    }
    public void incrementareNrImprumuturi() {
        this.nrInprumutari++;
    }

    // metode get
    public String getAutor() { return numeAutor; }
    public String getTitlu() {
        return titlu;
    }
    public int getISBN() {
        return ISBN;
    }
    public int getNrInprumutari() { return nrInprumutari; }

    // metode set
    public void setNumeAutor(String numeAutor) {
        this.numeAutor = numeAutor;
    }
    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
