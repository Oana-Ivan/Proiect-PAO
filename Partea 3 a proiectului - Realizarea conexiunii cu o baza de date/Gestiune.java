package clase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Gestiune {
    private List<Bibliotecar> bibliotecari;
    private List<Carte> carti;
    private List<Autor> autori;
    private List<Abonat> abonati;
    private List<Abonament> abonamente;

    public Gestiune() {
        bibliotecari = new ArrayList<Bibliotecar>();
        carti = new ArrayList<Carte>();
        autori = new ArrayList<Autor>();
        abonati = new ArrayList<Abonat>();
        abonamente = new ArrayList<Abonament>();
    }

    public void adaugareBibliotecar(String nume, int varsta, int salariu, int vechime) {
        Bibliotecar b = new Bibliotecar(nume, varsta, salariu, vechime);
        bibliotecari.add(b);
    }
    public void afisareBibliotecari() {
        for (int i = 0; i < bibliotecari.size(); i++) {
            System.out.print((i + 1) + ". ");
            bibliotecari.get(i).afisareDateComplete();
        }
    }
    public String afisareaBibliotecari() {
        String s = "";
        for (int i = 0; i < bibliotecari.size(); i++) {
            s += bibliotecari.get(i).getNume();
            s += ", ";
        }
        return s;
    }

    public void adaugareCarteLiteratura(String numeAutor, String titlu, int ISBN, String curentLiterar, int nrVolume) {
        int idxOfAutor = -1;
        for (int i = 0; idxOfAutor == -1 && i < autori.size(); i++) {
            if (autori.get(i).getNume().equals(numeAutor))
                idxOfAutor = i;
        }

        if (idxOfAutor == -1) {
            Scanner input = new Scanner(System.in);
            System.out.println("Varsta autor:");
            int varsta = input.nextInt();
            Autor autor = new Autor(numeAutor, varsta, titlu);
            autori.add(autor);
        }
        else {
            autori.get(idxOfAutor).addCarte(titlu);
        }
        CarteLiteratura carte = new CarteLiteratura(numeAutor, titlu, ISBN, curentLiterar, nrVolume);
        carti.add(carte);
    }
    public void adaugareCarteStiintifica(String numeAutor, String titlu, int ISBN, int nrTermeniIndex, int nrSurseBibliografice) {
        int idxOfAutor = -1;
        for (int i = 0; idxOfAutor == -1 && i < autori.size(); i++) {
            if (autori.get(i).getNume().equals(numeAutor))
                idxOfAutor = i;
        }
        if (idxOfAutor == -1) {
            Scanner input = new Scanner(System.in);
            System.out.println("Varsta autor:");
            int varsta = input.nextInt();
            Autor autor = new Autor(numeAutor, varsta, titlu);
            autori.add(autor);
        }
        else {
            autori.get(idxOfAutor).addCarte(titlu);
        }
        CarteStiintifica carte = new CarteStiintifica(numeAutor, titlu, ISBN, nrTermeniIndex, nrSurseBibliografice);
        carti.add(carte);
    }
    public void afisareCarti() {
        for (int i = 0; i < carti.size(); i++) {
            System.out.print((i + 1) + ". ");
            carti.get(i).afisareDate();
            System.out.println("\n");
        }
    }
    public String butonAfisareCarti() {
        String s = "";
        for (int i = 0; i < carti.size(); i++) {
            s += carti.get(i).getTitlu();
            s += ", ";
        }
        return s;
    }

    public void afisareCeaMaiCititaCarte() {
        int index = 0;
        for (int i = 0; i < carti.size(); i++) {
            if (carti.get(i).getNrInprumutari() > carti.get(index).getNrInprumutari())
                index = i;
        }
        carti.get(index).afisareDate();
    }
    public String ceaMaiCititaCarte() {
        int index = 0;
        for (int i = 0; i < carti.size(); i++) {
            if (carti.get(i).getNrInprumutari() > carti.get(index).getNrInprumutari())
                index = i;
        }
        return carti.get(index).getTitlu();
    }
    public void adaugareAutor(String nume, int varsta, String numeCarte, int isbn) {
        Carte carte = new Carte(nume, numeCarte, isbn);
        carti.add(carte);
        Autor autor = new Autor(nume, varsta, numeCarte);
        autori.add(autor);
    }
    public void afisareAutori() {
        for (int i = 0; i < autori.size(); i++) {
            System.out.print((i + 1) + ". ");
            autori.get(i).afisareDateComplete();
            System.out.println("\n");
        }
    }
    public void adaugareAbonat(String nume, int varsta, String numeAbonament, int penalizari) {
        Abonat abonat = new Abonat(nume, varsta, numeAbonament, penalizari);
        abonati.add(abonat);
    }
    public void afisareAbonati() {
        for (int i = 0; i < abonati.size(); i++) {
            System.out.print((i + 1) + ". ");
            abonati.get(i).afisareDateComplete();
        }
    }
    public String butonAfisareAbonati() {
        String s = "";
        for (int i = 0; i < abonati.size(); i++) {
            s += abonati.get(i).getNume();
            s += ", ";
        }
        return s;
    }

    public void adaugareAbonament(String denumire, int pret, int limitaNrCarti) {
        Abonament abonament = new Abonament(denumire, pret, limitaNrCarti);
        abonamente.add(abonament);
    }
    public void afisareAbonamente() {
        for (int i = 0; i < abonamente.size(); i++) {
            System.out.print((i + 1) + ". ");
            abonamente.get(i).afisareAbonament();
        }
    }
    public String butonAfisareAbonamente() {
        String s = "";
        for (int i = 0; i < abonamente.size(); i++) {
            s += abonamente.get(i).getDenumire();
            s += ", ";
        }
        return s;
    }

    public void adaugareImprumut(String numeAbonat, String numeCarte) {
        int index = -1;
        for (int i = 0; index == -1 && i < carti.size(); i++) {
            if (carti.get(i).getTitlu().equals(numeCarte))
                index = i;
        }
        System.out.println(index);
        if (index != -1)
            carti.get(index).incrementareNrImprumuturi();
        else {
            System.out.println("Cartea " + numeCarte + " nu exista");
            return;
        }

        index = -1;
        for (int i = 0; index == -1 && i < abonati.size(); i++) {
            if (abonati.get(i).getNume().equals(numeAbonat))
                index = i;
        }
        System.out.println(index);
        if (index != -1)
            abonati.get(index).incrementareNrImprumuturi();
        else {
            System.out.println("Abonatul " + numeAbonat + " nu exista");
            return;
        }
    }
    public void sortareCartiNrImprumuturi() {
        Collections.sort(carti, new sortCarti());
        afisareCarti();
    }
}
