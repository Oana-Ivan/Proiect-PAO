package clase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Audit {
    private static Audit instance;

    private Audit() {
    }

    public static Audit getInstance() {
        if (instance == null) {
            instance = new Audit();
        }
        return instance;
    }

    public static void scriereFisier(int optiuneAleasa) {
        String s = "";
        switch (optiuneAleasa) {
            case 0:
                s = "iesire din meniu";
                break;
            case 1: {
                s = "adaugare catre literatura";
                break;
            }
            case 2: {
                s = "adaugare carte stiintifica";
                break;
            }
            case 3: {
                s = "afisare carti";
                break;
            }
            case 4: {
                s = "afisare cea mai citita carte";
                break;
            }
            case 5: {
                s = "adaugare bibliotecar";
                break;
            }
            case 6: {
                s = "afisare bibliotecari";
                break;
            }
            case 7: {
                s = "adaugare autor";
                break;
            }
            case 8: {
                s = "afisare autori";
                break;
            }
            case 9: {
                s = "adaugare abonati";
                break;
            }
            case 10: {
                s = "afisare abonati";
                break;
            }
            case 11: {
                s = "adaugare abonament";
                break;
            }
            case 12: {
                s = "afisare abonamente";
                break;
            }
            case 13: {
                s = "adaugare imprumut";
                break;
            }
            case 14: {
                s = "sortare carti";
                break;
            }
        }

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();

        try {
            File file = new File("audit.csv");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.write(Paths.get("audit.csv"), (s + "," + dateFormat.format(date) + "\n").getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
        }

    }
}