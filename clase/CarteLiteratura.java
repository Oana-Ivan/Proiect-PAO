package clase;

public class CarteLiteratura extends Carte{
    private String curentLiterar;
    private int nrVolume;

    public CarteLiteratura(Autor autor, String titlu, int ISBN,  String curentLiterar, int nrVolume) {//int ziR, int lunaR, int anR,
        super(autor, titlu, ISBN); //, ziR, lunaR, anR);
        this.curentLiterar = curentLiterar;
        this.nrVolume = nrVolume;
    }

    public String getCurentLiterar() {
        return curentLiterar;
    }
    public int getNrVolume() {
        return nrVolume;
    }

    public void setCurentLiterar(String curent) {
        curentLiterar = curent;
    }
    public void setNrVolume(int nr) {
        nrVolume = nr;
    }
}
