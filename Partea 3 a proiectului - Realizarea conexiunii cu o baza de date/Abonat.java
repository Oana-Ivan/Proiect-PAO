package clase;

public class Abonat extends Persoana {
    private static int nrAbonat;
    private String idAbonat;
    private String numeAbonament;
    private int penalizari;
    private int nrCartiImprumutate;

    public Abonat(String nume, int varsta, String numeAbonament, int penalizari) {
        super(nume, varsta);
        this.numeAbonament = numeAbonament;
        this.penalizari = penalizari;
        nrAbonat++;
        idAbonat = "abonat" + Integer.toString(nrAbonat);
    }

    @Override
    public void afisareDateComplete() {
        System.out.println("Id abonat: " + this.idAbonat);
        System.out.println("Nume: " + this.getNume());
        System.out.println("Abonament:" + this.numeAbonament);
        System.out.println("Penalizari: " + this.penalizari);
    }
    public void incrementareNrImprumuturi() {
        nrCartiImprumutate++;
    }

    // metode get
    public String getIdAbonat() {
        return idAbonat;
    }
    public String getAbonament() {
        return numeAbonament;
    }
    public int getPenalizari() {
        return penalizari;
    }

    // metode set
    public void setIdAbonat(String idAbonat) {
        this.idAbonat = idAbonat;
    }
    public void setAbonament(String numeAbonament) {
        this.numeAbonament = numeAbonament;
    }
    public void setPenalizari(int penalizari) {
        this.penalizari = penalizari;
    }
}
