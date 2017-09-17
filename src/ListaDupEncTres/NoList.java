package ListaDupEncTres;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class NoList {

    public NoList() {
        this.prox = null;
        this.ant = null;
    }

    private double valor;
    private NoList prox;
    private NoList ant;
    private int linha;
    private int coluna;
    private int localizardado;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public NoList getProx() {
        return prox;
    }

    public void setProx(NoList prox) {
        this.prox = prox;
    }

    public NoList getAnt() {
        return ant;
    }

    public void setAnt(NoList ant) {
        this.ant = ant;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLocalizardado() {
        return localizardado;
    }

    public void setLocalizardado(int localizardado) {
        this.localizardado = localizardado;
    }





}
