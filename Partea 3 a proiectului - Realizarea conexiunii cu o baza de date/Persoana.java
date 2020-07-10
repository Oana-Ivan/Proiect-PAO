package clase;


abstract class Persoana {
    private String nume;
    private int varsta;

    // constructori
    public Persoana(Persoana persoana) {
        this.nume = persoana.nume;
        this.varsta = persoana.varsta;
    }
    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void afisareDateComplete() {
        System.out.println("Nume: " + this.nume);
        System.out.println("Varsta: " + this.varsta);
    }

    // metode get
    public String getNume() {
        return nume;
    }
    public int getVarsta() {
        return varsta;
    }

    // metode set
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}

