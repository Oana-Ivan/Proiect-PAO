package clase;

import java.util.Comparator;

public class sortCarti implements Comparator<Carte> {
    public int compare(Carte carte1, Carte carte2) {
        return carte1.getNrInprumutari() - carte2.getNrInprumutari();
    }
}