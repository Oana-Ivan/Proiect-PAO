package clase;

public class Abonat extends Persoana{
    private static int nrAbonat;
    private String idAbonat;
    private Abonament abonament;
    private int penalizari;

    public Abonat(String nume, int varsta, Abonament abonament, int penalizari) {
        super(nume, varsta);
        this.abonament = abonament;
        this.penalizari = penalizari;

        nrAbonat++;
        idAbonat = "abonat" + Integer.toString(nrAbonat);
    }

    @Override
    public void afisareDateComplete() {
        System.out.println("Id abonat: " + this.idAbonat);
        System.out.println("Nume: " + this.getNume());
        System.out.println("Abonament:" + this.abonament.getDenumire());
        System.out.println("Penalizari: " + this.penalizari);
    }
    // metode get
    public String getIdAbonat() {
        return idAbonat;
    }
    public Abonament getAbonament() {
        return abonament;
    }
    public int getPenalizari() {
        return penalizari;
    }

    // metode set
    public void setIdAbonat(String idAbonat) {
        this.idAbonat = idAbonat;
    }
    public void setAbonament(Abonament abonament) {
        this.abonament = abonament;
    }
    public void setPenalizari(int penalizari) {
        this.penalizari = penalizari;
    }
}
