package clase;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Persoana {
    private int nrCarti;
    private List<String> listaTitluriCarti;

    public Autor(String nume, int varsta, String numeCarte) {
        super(nume, varsta);
        listaTitluriCarti = new ArrayList<String>();
        addCarte(numeCarte);
    }
    public Autor(String nume, int varsta, int nrCarti, List<String> listaTitluriCarti) {
        super(nume, varsta);
        this.listaTitluriCarti = new ArrayList<String>();
        this.nrCarti = nrCarti;
        for (int i = 0; i < this.listaTitluriCarti.size(); i++) {
            this.listaTitluriCarti.add(listaTitluriCarti.get(i));
        }
    }

    // metode get
    public int getNrCarti () { return nrCarti; }
    public List<String> getListaTitluriCarti () {
        return listaTitluriCarti;
    }

    @Override
    public void afisareDateComplete() {
        System.out.println("Autor: " + getNume());
        System.out.println("Numar carti: " + this.nrCarti);
        for (int i = 0; i < this.nrCarti; i++) {
            System.out.println((i + 1) + ". " + this.listaTitluriCarti.get(i));
        }
    }

    public void addCarte(String c) {
        nrCarti++;
        listaTitluriCarti.add(c);
    }
}
