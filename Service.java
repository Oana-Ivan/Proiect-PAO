package clase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private static Service instance;

    private Service() {
    }

    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }


    public List<Abonat> readAbonat() {
        List<Abonat> abonati = new ArrayList<Abonat>();

        try {
            for (String line : Files.readAllLines(Paths.get("abonati.csv"))) {
                String[] values = line.split(",");

                Abonat a = new Abonat(values[0] , Integer.valueOf(values[1]), values[2] , Integer.valueOf(values[3]));
                abonati.add(a);
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }
        return abonati;
    }

    public List<Bibliotecar> readBibliotecar() {
        List<Bibliotecar> bibliotecari = new ArrayList<Bibliotecar>();

        try {
            for (String line : Files.readAllLines(Paths.get("bibliotecari.csv"))) {
                String[] values = line.split(",");

                Bibliotecar b = new Bibliotecar(values[0] , Integer.valueOf(values[1]), Integer.valueOf(values[2]) , Integer.valueOf(values[3]));
                bibliotecari.add(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bibliotecari;
    }

    public List<CarteLiteratura> readCarteLiteratura() {
        List<CarteLiteratura> cl = new ArrayList<CarteLiteratura>();

        try {
            for (String line : Files.readAllLines(Paths.get("cartiLiteratura.csv"))) {
                String[] values = line.split(",");

                CarteLiteratura c = new CarteLiteratura(values[0] , values[1], Integer.valueOf(values[2]) , values[3], Integer.valueOf(values[4]));
                cl.add(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cl;
    }

    public List<CarteStiintifica> readCarteStiintifica() {
        List<CarteStiintifica> cl = new ArrayList<CarteStiintifica>();

        try {
            for (String line : Files.readAllLines(Paths.get("cartiStiintifice.csv"))) {
                String[] values = line.split(",");

                CarteStiintifica c = new CarteStiintifica(values[0] , values[1], Integer.valueOf(values[2]) , Integer.valueOf(values[3]), Integer.valueOf(values[4]));
                cl.add(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cl;
    }

    public void writeAbonat(List<Abonat> abonati) {
        try {
            File fila = new File("abonati.csv");
            fila.createNewFile();
        } catch (IOException e) {
            // e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("abonati.csv");
            myWriter.write("");
            for(Abonat a: abonati)
                myWriter.write(a.getNume() + "," + a.getVarsta() + "," + a.getAbonament() + "," + a.getPenalizari() + "\n");

            myWriter.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    public void writeBibliotecar(List<Bibliotecar> bibliotecari) {
        try {
            File fila = new File("bibliotecari.csv");
            fila.createNewFile();
        } catch (IOException e) {
            // e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("bibliotecari.csv");
            myWriter.write("");
            for(Bibliotecar b: bibliotecari)
                myWriter.write(b.getNume() + "," + b.getVarsta() + "," + b.getSalariu() + "," + b.getVechime() + "\n");

            myWriter.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    public void writeCarti(List<Carte> carti) {
        try {
            File fila = new File("carti.csv");
            fila.createNewFile();
        } catch (IOException e) {
            // e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("carti.csv");
            myWriter.write("");
            for(Carte c: carti)
                myWriter.write(c.getAutor() + "," + c.getTitlu() + "," + c.getISBN() + "\n");

            myWriter.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }



}