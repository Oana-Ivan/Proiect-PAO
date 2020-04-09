package clase;

public class Autor extends Persoana {
    private int nrCarti;
    private String [] listaTitluriCarti;

    public Autor(String nume, int varsta, String numeCarte) {
        super(nume, varsta);
        addCarte(numeCarte);
    }
    public Autor(String nume, int varsta, int nrCarti, String [] listaTitluriCarti) {
        super(nume, varsta);
        this.nrCarti = nrCarti;
        for (int i = 0; i < nrCarti; i++) {
            this.listaTitluriCarti[i] = listaTitluriCarti[i];
        }
    }

    public int getNrCarti () {
        return nrCarti;
    }
    public String[] getListaTitluriCarti () {
        return listaTitluriCarti;
    }
    @Override
    public void afisareDateComplete() {
        System.out.println("Autor: " + getNume());
        System.out.println("Numar carti: " + this.nrCarti);
        for (int i = 0; i < this.nrCarti; i++) {
            System.out.println((i + 1) + ". " + this.listaTitluriCarti[i]);
        }
    }

    public void addCarte(String c) {
        nrCarti++;
        listaTitluriCarti[nrCarti] = c;
    }
}
