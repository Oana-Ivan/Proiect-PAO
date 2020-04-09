package clase;

public class CarteLiteratura extends Carte{
    private String curentLiterar;
    private int nrVolume;

    public CarteLiteratura() {
        super();
        this.curentLiterar = "";
        this.nrVolume = 0;
    }
    public CarteLiteratura(String autor, String titlu, int ISBN,  String curentLiterar, int nrVolume) {
        super(autor, titlu, ISBN);
        this.curentLiterar = curentLiterar;
        this.nrVolume = nrVolume;
    }

    @Override
    public void afisareDate() {
        System.out.println("Titlu carte literatura: " + this.getTitlu());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("ISBN: " + this.getISBN());
        System.out.println("Curent literar: " + curentLiterar);
        System.out.println("Nr volume: " + nrVolume);
        System.out.println("Nr imprumuturi " + this.getNrInprumutari());
    }
    // metode get
    public String getCurentLiterar() {
        return curentLiterar;
    }
    public int getNrVolume() {
        return nrVolume;
    }

    // metode set
    public void setCurentLiterar(String curent) {
        curentLiterar = curent;
    }
    public void setNrVolume(int nr) {
        nrVolume = nr;
    }
}
