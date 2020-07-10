package clase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws SQLException {
        ConexiuneBD bd = new ConexiuneBD();
        // afisare meniu
        afisareMeniu();

        Scanner input = new Scanner(System.in);
        Gestiune g = new Gestiune();
        Audit audit = Audit.getInstance();

        // incarcare din baza de date in gestiune
        Statement stmt = bd.getConnection().createStatement();

        ResultSet results = stmt.executeQuery("select * from bibliotecari");
        while(results.next()) {
            String nume = results.getString(1);
            int varsta = results.getInt(2);
            int salariu = results.getInt(3);
            int vechime = results.getInt(4);
            g.adaugareBibliotecar(nume, varsta, salariu, vechime);
        }

        results = stmt.executeQuery("select * from autori");
        while(results.next()) {
            String nume = results.getString(1);
            int varsta = results.getInt(2);
            String carte = results.getString(3);
            int isbn = results.getInt(4);
            g.adaugareAutor(nume, varsta, carte, isbn);
        }

        results = stmt.executeQuery("select * from abonati");
        while(results.next()) {
            String nume = results.getString(1);
            int varsta = results.getInt(2);
            String numeAbonament = results.getString(3);
            int penalizari = results.getInt(4);
            g.adaugareAbonat(nume, varsta, numeAbonament, penalizari);
        }

        results = stmt.executeQuery("select * from abonamente");
        while(results.next()) {
            String denumire = results.getString(1);
            int pret = results.getInt(2);
            int nrLimitaCarti = results.getInt(3);
            g.adaugareAbonament(denumire, pret, nrLimitaCarti);
        }

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
                    System.out.println("Numar de volume: "); int nrVolume = input.nextInt();
                    enter = input.nextLine();

                    // apelare functie din gestiune
                    g.adaugareCarteLiteratura(numeAutorCarte, titlu, ISBN, curentLiterar, nrVolume);

                    // adaugare in baza de date
                    bd.addCarteLiteratura(numeAutorCarte, titlu, ISBN, curentLiterar, nrVolume);
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

                    // adaugare in baza de date
                    bd.adaugareCarteStiintifica(numeAutorCarteS, titluCarteS, ISBNS, nrTermeniIndex, nrSurseBibliografice);
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

                    bd.adaugareBibliotecar(numeBibliotecar, varsta, salariu, vechime);

                    break;
                }
                case 6: {
                    // g.afisareBibliotecari();
                    // afisare carti din baza de date
                    bd.afisareBibliotecari();
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

                    // adaugare in baza de date
                    bd.adaugareAutor(numeAutor, varstaAutor, numeCarte, isbn);
                    break;
                }
                case 8: {
                    // g.afisareAutori();
                    // afisare din baza de date
                    bd.afisareAutori();
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

                    // baze de date
                    bd.adaugareAbonat(nume, varstaAbonat, numeAbonament, penalizari);

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

                    // adaugare in baza de date
                    bd.adaugareAbonament(denumire, pret, limitaNrCarti);
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
                    // adaugare in baza de date
                    bd.adaugareImprumut(numeAbonat, numeCarte);
                    break;
                }
                case 14: {
                    g.sortareCartiNrImprumuturi();
                    break;
                }
                case 15: {
                    System.out.println("x = ");
                    int x = input.nextInt();
                    bd.stergereAbonatiCuPenalizari(x);
                    break;
                }
                case 16: {
                    System.out.println("Numele bibliotecar: "); String nume = input.nextLine();
                    bd.stergereBibliotecar(nume);
                    break;
                }
                case 17: {
                    System.out.println("Procentul maririi(x%): ");
                    float procent = input.nextInt();
                    bd.marireSalariuBibliotecari(procent);
                    break;
                }
                case 18: {
                    System.out.println("Procentul maririi(x%): ");
                    float procent = input.nextInt();
                    bd.marirePretAbonamente(procent);
                    break;
                }
                default:
                    System.out.println("Optiunea aleasa nu exista.");

            }
            audit.scriereFisier(optiuneAleasa);
        }

        // GUI
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        JButton b = new JButton("Titlul celei citite carti");
        panel.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel l1 = new JLabel(g.ceaMaiCititaCarte());
                panel.add(l1);
            }
        });

        JButton b2 = new JButton("Afisare bibliotecari");
        panel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel l2 = new JLabel(g.afisareaBibliotecari());
                panel.add(l2);
            }
        });

        JButton b3 = new JButton("Afisare carti");
        panel.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel l3 = new JLabel(g.butonAfisareCarti());
                panel.add(l3);
            }
        });

        JButton b4 = new JButton("Afisare abonati");
        panel.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel l4 = new JLabel(g.butonAfisareAbonati());
                panel.add(l4);
            }
        });

        JButton b5 = new JButton("Afisare abonamente");
        panel.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel l5= new JLabel(g.butonAfisareAbonamente());
                panel.add(l5);
            }
        });

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Biblioteca");
        frame.pack();
        frame.setVisible(true);

        bd.close();
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
        // stergere din baza de date
        System.out.println("15. Stergere abonati cu penalizari mai mari de x lei");
        System.out.println("16. Stergere bibliotecari dupa nume");
        // update baza de date
        System.out.println("17. Marire salariu bibliotecari");
        System.out.println("18. Marire pret abonamente");
    }

}