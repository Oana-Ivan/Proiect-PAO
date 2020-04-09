package clase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // afisare meniu
        System.out.println("Alegeti intre:");
        System.out.println("0. Iesire");
        System.out.println("1. Adaugare carte");
        System.out.println("2. Afisare carti");
        System.out.println("3. Stergere carte");
        System.out.println("4. Cea mai citita carte");
        System.out.println("5. Adaugare bibliotecar");
        System.out.println("6. Afisare Bibliotecari");
        System.out.println("7. Adaugare autor");
        System.out.println("8. Afisare autori");
        System.out.println("9. Adaugare abonat");
        System.out.println("10. Afisare abonati");
        System.out.println("11. Adaugare abonament");
        System.out.println("12. Afisare abonamente");

        Scanner input = new Scanner(System.in);
        Gestiune g = new Gestiune();
        int p = 1;
        while (p != 0) {
            p = input.nextInt();
            String enter = input.nextLine();
            switch (p) {
                case 0:
                    break;
                case 1: // adaugare carte
                    System.out.println("Numele autorului:");
                    String numeAutor = input.nextLine();
                    System.out.println("Titlul cartii: ");
                    String titlu = input.nextLine();
                    System.out.println("ISBN: ");
                    int ISBN = input.nextInt();

                    g.adaugareCarte(numeAutor, titlu, ISBN);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                default:

            }
        }
//        Scanner input = new Scanner(System.in);
////        String userName = input.nextLine();
//        Gestiune g = new Gestiune();
//        Bibliotecar b = new Bibliotecar("Andrei", 32, 3000, 5);
//        String nume = input.nextLine();
//        int v = input.nextInt();
//        int s = input.nextInt();
//        int vech = input.nextInt();
//        Bibliotecar z = new Bibliotecar(nume, v, s, vech);
//        g.adaugareBibliotecar(z);
//
////        b.afisareDateComplete();
//        g.adaugareBibliotecar(b);
//        g.afisareBibliotecari();

    }
}
