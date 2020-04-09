package clase;

public class Carte {
    private Autor autor;
    private String titlu;
    private int ISBN;
//    private int ziRetur, lunaRetur, anRetur;
    private int nrInprumutari;

    public Carte (Autor autor, String titlu, int ISBN) { //, int ziR, int lunaR, int anR) {
        this.autor = autor;
        this.titlu = titlu;
        this.ISBN = ISBN;
//        this.ziRetur = ziR;
//        this.lunaRetur = lunaR;
//        this.anRetur = anR;
        this.nrInprumutari = 0;
    }
    public void afisareDate() {
        System.out.println("Titlu: " + titlu);
        System.out.println("Autor: " + this.autor.getNume());
        System.out.println("ISBN: " + this.ISBN);
    }
    // metode get
    public Autor getAutor() { return autor; }
    public String getTitlu() {
        return titlu;
    }
    public int getISBN() {
        return ISBN;
    }
//    public int getZiRetur() {
//        return ziRetur;
//    }
//    public int getLunaRetur() {
//        return lunaRetur;
//    }
//    public int getAnRetur() {
//        return anRetur;
//    }
    public int getNrInprumutari() { return nrInprumutari; }

    // metode set
    public void setAutor(Autor a) {
        autor = a;
    }
    public void setTitlu(String t) {
        titlu = t;
    }
    public void setISBN(int i) {
        ISBN = i;
    }
//    public void setZiRetur(int zi) {
//        ziRetur = zi;
//    }
//    public void setLunaRetur(int luna) {
//        lunaRetur = luna;
//    }
//    public void setAnRetur(int an) {
//        anRetur = an;
//    }
}
