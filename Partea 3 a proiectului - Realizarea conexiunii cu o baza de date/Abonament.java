package clase;

public class Abonament {
    private String denumire;
    private int pret;
    private int limitaNrCarti;
    private static int nrAbonamente = 0;

    public Abonament (String denumire, int pret, int limitaNrCarti) {
        this.denumire = denumire;
        this.pret = pret;
        this.limitaNrCarti = limitaNrCarti;
        this.nrAbonamente++;
    }
    public void afisareAbonament() {
        System.out.println("Denumire: " + denumire);
        System.out.println("Pret: " + pret);
        System.out.println("Limita carti imprumutate/saptamana: " + limitaNrCarti);
    }
    // metode get
    public String getDenumire() {
        return denumire;
    }
    public int getPret() {
        return pret;
    }
    public int getLimitaNrCarti() {
        return limitaNrCarti;
    }
    public static int getNrAbonamente() {
        return nrAbonamente;
    }

    // metode set
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public void setPret(int pret) {
        this.pret = pret;
    }
    public void setLimitaNrCarti(int limitaNrCarti) {
        this.limitaNrCarti = limitaNrCarti;
    }
}
