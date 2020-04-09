package clase;

public class CarteStiintifica extends Carte{
    private int nrTermeniIndex;
    private int nrSurseBibliografice;

    public CarteStiintifica(Autor autor, String titlu, int ISBN, int nrTermeniIndex, int nrSurseBibliografice) {//int ziR, int lunaR, int anR,
        super(autor, titlu, ISBN); //, ziR, lunaR, anR);
        this.nrTermeniIndex = nrTermeniIndex;
        this.nrSurseBibliografice = nrSurseBibliografice;
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
