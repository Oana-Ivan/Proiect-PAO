package clase;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // afisare meniu
        afisareMeniu();

        Scanner input = new Scanner(System.in);
        Gestiune g = new Gestiune();
        int optiuneAleasa = 1;

        while (optiuneAleasa != 0) {
            System.out.println("Selectati optiune din meniu");
            optiuneAleasa = input.nextInt();
            String enter = input.nextLine();
            switch (optiuneAleasa) {
                case 0:
                    break;
                case 1: {
                    // citire date de la tastatura
                    System.out.println("Titlul cartii: "); String titlu = input.nextLine();
                    System.out.println("Numele autorului:"); String numeAutorCarte = input.nextLine();
                    System.out.println("ISBN: "); int ISBN = input.nextInt();
                    enter = input.nextLine();
                    System.out.println("Curent literar: "); String curentLiterar = input.nextLine();
                    System.out.println("Nrmar de volume: "); int nrVolume = input.nextInt();
                    enter = input.nextLine();

                    // apelare functie din gestiune
                    g.adaugareCarteLiteratura(numeAutorCarte, titlu, ISBN, curentLiterar, nrVolume);
                    break;
                }
                case 2: {
                    // citire date de la tastatura
                    System.out.println("Titlul cartii: "); String titluCarteS = input.nextLine();
                    System.out.println("Numele autorului:"); String numeAutorCarteS = input.nextLine();
                    System.out.println("ISBN: "); int ISBNS = input.nextInt();
                    enter = input.nextLine();
                    System.out.println("Numar de termeni din index: "); int nrTermeniIndex = input.nextInt();
                    enter = input.nextLine();
                    System.out.println("Numar de surse bibliografice: "); int nrSurseBibliografice = input.nextInt();
                    enter = input.nextLine();

                    // apelare functie din gestiune
                    g.adaugareCarteStiintifica(numeAutorCarteS, titluCarteS, ISBNS, nrTermeniIndex, nrSurseBibliografice);
                    break;
                }
                case 3: {
                    g.afisareCarti();
                    break;
                }
                case 4: {
                    g.afisareCeaMaiCititaCarte();
                    break;
                }
                case 5: {
                    // citire date de la tastatura
                    System.out.println("Numele bibliotecar:"); String numeBibliotecar = input.nextLine();
                    System.out.println("Varsta: "); int varsta = input.nextInt();
                    System.out.println("Salariu: "); int salariu = input.nextInt();
                    System.out.println("Vechime: "); int vechime = input.nextInt();

                    // apelare functie din gestiune
                    g.adaugareBibliotecar(numeBibliotecar, varsta, salariu, vechime);
                    break;
                }
                case 6: {
                    g.afisareBibliotecari();
                    break;
                }
                case 7: {
                    // citire date de la tastatura
                    System.out.println("Nume autor: "); String numeAutor = input.nextLine();
                    System.out.println("Varsta autorului:"); int varstaAutor = input.nextInt();
                    enter = input.nextLine();
                    System.out.println("Numele unei carti scrise de autor"); String numeCarte = input.nextLine();
                    System.out.println("ISBN:"); int isbn = input.nextInt();
                    enter = input.nextLine();

                    // apel functie din gestiune
                    g.adaugareAutor(numeAutor, varstaAutor, numeCarte, isbn);
                    break;
                }
                case 8: {
                    g.afisareAutori();
                    break;
                }
                case 9: {
                    // citire date de la tastatura
                    System.out.println("Numele abonat:"); String nume = input.nextLine();
                    System.out.println("Varsta: "); int varstaAbonat = input.nextInt();
                    enter = input.nextLine();
                    System.out.println("Nume abonament: "); String numeAbonament = input.nextLine();
                    System.out.println("Penalizari anterioare: "); int penalizari = input.nextInt();
                    enter = input.nextLine();

                    // apel functie din gestiune
                    g.adaugareAbonat(nume, varstaAbonat, numeAbonament, penalizari);
                    break;
                }
                case 10: {
                    g.afisareAbonati();
                    break;
                }
                case 11: {
                    // citire date de la tastatura
                    System.out.println("Denumire abonament: "); String denumire = input.nextLine();
                    System.out.println("Pret: "); int pret = input.nextInt();
                    enter = input.nextLine();
                    System.out.println("Limita de carti ce pot fi imprumutate: "); int limitaNrCarti = input.nextInt();
                    enter = input.nextLine();

                    // apel functie
                    g.adaugareAbonament(denumire, pret, limitaNrCarti);
                    break;
                }
                case 12: {
                    g.afisareAbonamente();
                    break;
                }
                case 13: {
                    System.out.println("Numele abonatului"); String numeAbonat = input.nextLine();
                    System.out.println("Titlul cartii: "); String numeCarte = input.nextLine();

                    g.adaugareImprumut(numeAbonat, numeCarte);
                    break;
                }
                case 14: {
                    g.sortareCartiNrImprumuturi();
                    break;
                }
                default:
                    System.out.println("Optiunea aleasa nu exista.");

            }
        }
    }

    public static void afisareMeniu() {
        System.out.println("Alegeti intre:");
        System.out.println("0. Iesire");
        System.out.println("1. Adaugare carte literatura");
        System.out.println("2. Adaugare carte stiintifica");
        System.out.println("3. Afisare carti");
        System.out.println("4. Cea mai citita carte");
        System.out.println("5. Adaugare bibliotecar");
        System.out.println("6. Afisare Bibliotecari");
        System.out.println("7. Adaugare autor");
        System.out.println("8. Afisare autori");
        System.out.println("9. Adaugare abonat");
        System.out.println("10. Afisare abonati");
        System.out.println("11. Adaugare abonament");
        System.out.println("12. Afisare abonamente");
        System.out.println("13. Adauga imprumut");
        System.out.println("14. Sortare carti dupa numar imprumuturi");
    }
}
