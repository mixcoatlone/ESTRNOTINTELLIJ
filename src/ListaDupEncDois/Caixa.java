package ListaDupEncDois;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class Caixa {

    private int elemento;
    private Caixa prox;
    private Caixa ant;

    public Caixa() {
        this.prox = null;
        this.ant=null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Caixa getAnt() {
        return ant;
    }

    public void setAnt(Caixa ant) {
        this.ant = ant;
    }

    public Caixa getProx() {
        return prox;
    }

    public void setProx(Caixa prox) {
        this.prox = prox;
    }


}
