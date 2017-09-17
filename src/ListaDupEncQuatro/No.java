package ListaDupEncQuatro;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class No {

    private No anterior;
    private String elemento;
    private No prox;

    public No(String elemento) {
        this(null, elemento, null);
    }


    public No(No anterior, String elemento, No prox) {
        this.anterior = anterior;
        this.elemento = elemento;
        this.prox = prox;
    }

    public No getAnterior(){
        return this.anterior;
    }

    public void setAnterior(No anterior){
        this.anterior = anterior;
    }

    public No getProximo(){
        return this.prox;
    }

    public void setProximo(No prox){
        this.prox = prox;
    }

    public String getElemento(){
        return this.elemento;
    }

    public void setElemento(String elemento){
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return this.elemento + " -> " + this.prox;
    }


}
