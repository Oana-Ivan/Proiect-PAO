package clase;

import java.sql.*;

public class ConexiuneBD {
    Connection connection;

    public ConexiuneBD() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/biblioteca", "root", "1234");
    }

    public Connection getConnection() {
        return connection;
    }
    // metode de adaugare in baza de date

    public void addCarteLiteratura(String numeAutorCarte, String titlu, int ISBN, String curentLiterar, int nrVolume) throws SQLException {
        String query = "Insert into cartiliteratura " + "values('" + numeAutorCarte + "', '" + titlu + "', " + ISBN + ", '" + curentLiterar + "', " + nrVolume + ")";
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("A fost introdusa " + n + " carte de literatura in baza de date.");
    }

    public void adaugareCarteStiintifica(String numeAutorCarteS, String titluCarteS, int ISBNS, int nrTermeniIndex, int nrSurseBibliografice) throws SQLException {
        String query = "Insert into cartistiintifice " + "values('" + numeAutorCarteS + "', '" + titluCarteS + "', " + ISBNS + ", " + nrTermeniIndex + ", " + nrSurseBibliografice + ")";
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("A fost introdusa " + n + " carte stiintifica in baza de date.");
    }

    public void adaugareBibliotecar(String numeBibliotecar, int varsta, int salariu, int vechime) throws SQLException {
        String query = "Insert into bibliotecari " + "values('" + numeBibliotecar + "', " + varsta + ", " + salariu + ", " + vechime + ")";
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("A fost introdus " + n + " bibliotecar in baza de date.");
    }

    public void adaugareAutor(String numeAutor, int varstaAutor, String numeCarte, int isbn) throws SQLException {
        String query = "Insert into autori " + "values('" + numeAutor + "', " + varstaAutor + ", '" + numeCarte + "', " + isbn + ")";
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("A fost introdus " + n + " autor in baza de date.");
    }

    public void adaugareAbonat(String nume, int varstaAbonat, String numeAbonament, int penalizari) throws SQLException {
        String query = "Insert into abonati " + "values('" + nume + "', " + varstaAbonat + ", '" + numeAbonament + "', " + penalizari + ")";
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("A fost introdus " + n + " abonat in baza de date.");
    }

    public void adaugareAbonament(String denumire, int pret, int limitaNrCarti) throws SQLException {
        String query = "Insert into abonamente " + "values('" + denumire + "', " + pret + ", "+ limitaNrCarti + ")";
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("A fost introdus " + n + " abonament in baza de date.");
    }

    public void adaugareImprumut(String numeAbonat, String numeCarte) throws SQLException {
        String query = "Insert into imprumuturi " + "values('" + numeAbonat + "', '" + numeCarte + "')";
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("A fost inregistrat " + n + " imprumut in baza de date.");
    }

    // metode pentru stergerea din baza de date
    public void stergereAbonatiCuPenalizari(int x) throws SQLException {
        String query = "delete from abonati where penalizari > " + x;
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("Nr de abonati stersi din baza de date: " + n);
    }

    public void stergereBibliotecar(String nume) throws SQLException {
        String query = "delete from bibliotecari where numeBibliotecar = '" + nume + "'";
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("Nr de bibliotecari stersi din baza de date: " + n);
    }

    // metode pentru actualizarea bazei de date
    public void marireSalariuBibliotecari(float procent) throws SQLException {
        procent = procent/100 + 1;
        System.out.println(procent);
        String query = "update bibliotecari set salariu = " + procent + " * salariu";
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("Nr de bibliotecari carora li s-a actualizat salariul in baza de date: " + n);
    }

    public void marirePretAbonamente(float procent) throws SQLException {
        procent = procent/100 + 1;
        System.out.println(procent);
        String query = "update abonamente set pret = " + procent + " * pret";
        Statement stmt = connection.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println("Nr de abonamente carora li s-a actualizat pretul in baza de date: " + n);
    }

    // metode de afisare a continutului bazei de date
    public void afisareBibliotecari() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery("select * from bibliotecari");
        while(results.next()) {
            System.out.println("Nume : ");
            System.out.println(results.getString(1));
            System.out.println("Salariu: ");
            System.out.println(results.getString(3));
            System.out.println("Vechime: ");
            System.out.println(results.getString(4));
            System.out.println("------------------------------");
        }
    }

    public void afisareAutori() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery("select * from autori");
        while(results.next()) {
            System.out.println("Nume : ");
            System.out.println(results.getString(1));
            System.out.println("Varsta: ");
            System.out.println(results.getString(2));
            System.out.println("------------------------------");
        }
    }

    public void close() throws SQLException {
        connection.close();
    }
}