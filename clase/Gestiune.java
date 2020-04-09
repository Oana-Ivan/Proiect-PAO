package clase;

import java.util.ArrayList;
import java.util.List;

public class Gestiune {
    List<Bibliotecar> bibliotecari;
    List<Carte> carti;
    List<Autor> autori;
    List<Abonat> abonati;
    List<Abonament> abonamente;
//    private Bibliotecar[] bibliotecar;
//    private static int nrBibliotecari;
//    Carte[] carti;
//    Autor[] autori;
//    Abonat[] abonati;
//    Abonament[] abonamente;

    public Gestiune() {
        bibliotecari = new ArrayList<Bibliotecar>();
        carti = new ArrayList<Carte>();
        autori = new ArrayList<Autor>();
        abonati = new ArrayList<Abonat>();
        abonamente = new ArrayList<Abonament>();
    }
    public void adaugareBibliotecar(Bibliotecar b) {
        bibliotecari.add(b);
    }
    public void afisareBibliotecari() {
        System.out.println("ceva");
        for (int i = 0; i < bibliotecari.size(); i++) {
            System.out.println((i + 1) + ". ");
            bibliotecari.get(i).afisareDateComplete();
        }
    }
    public void adaugareCarte(String numeAutor, String titlu, int ISBN) {
        int indexOfAutor = -1;
        for (int i = 0; indexOfAutor == -1 && i < autori.size(); i++) {
            if (autori.get(i).getNume() == numeAutor)
                indexOfAutor = i;
        }
        Autor autor;
        if (indexOfAutor == -1) {
            int varsta = 0;
            autor = new Autor(numeAutor, varsta, titlu);
        }
        else {
            autor = autori.get(indexOfAutor);
            autori.add(autor);
        }
        Carte carte = new Carte(autor, titlu, ISBN);
        carti.add(carte);
    }
    public void afisareCarti() {
        System.out.println("ceva");
        for (int i = 0; i < carti.size(); i++) {
            System.out.println((i + 1) + ". ");
            carti.get(i).afisareDate();
        }
    }
    public void adaugareAutor(Autor autor) {
        autori.add(autor);
    }
    public void afisareAutori() {
        System.out.println("ceva");
        for (int i = 0; i < autori.size(); i++) {
            System.out.println((i + 1) + ". ");
            autori.get(i).afisareDateComplete();
        }
    }
    public void adaugareAbonament(Abonament abonament) {
        abonamente.add(abonament);
    }
    public void afisareAbonamente() {
        System.out.println("ceva");
        for (int i = 0; i < abonamente.size(); i++) {
            System.out.println((i + 1) + ". ");
            abonamente.get(i).afisareAbonament();
        }
    }
}
