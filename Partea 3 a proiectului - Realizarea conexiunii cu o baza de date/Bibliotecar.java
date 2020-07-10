package clase;

public class Bibliotecar extends Persoana{
    private int salariu;
    private int vechime;

    public Bibliotecar(Bibliotecar bibliotecar) {
        super(bibliotecar);
        this.salariu = bibliotecar.salariu;
        this.vechime = bibliotecar.vechime;
    }
    public Bibliotecar(String nume, int varsta, int salariu, int vechime) {
        super(nume, varsta);
        this.salariu = salariu;
        this.vechime = vechime;
    }

    @Override
    public void afisareDateComplete() {
        System.out.println("Nume: " + this.getNume());
        System.out.println("Salariu: " + this.salariu);
        System.out.println("Vechime: " + this.vechime);
    }

    public int getSalariu() {
        return salariu;
    }
    public int getVechime() {
        return vechime;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
    public void setVechime(int vechime) {
        this.vechime = vechime;
    }
}
