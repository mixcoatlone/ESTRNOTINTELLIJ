package ListaDupEncQuatro;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class ListaAlfabetica {

    No inicio;
    No fim;
    int quant;

    public ListaAlfabetica() {
        inicio = null;
        fim = null;
        quant = 0;
    }

    public void inserirInicio(No novoNo) {
        if (inicio == null) {
            fim = novoNo;
        }
        novoNo.setProximo(inicio);
        this.inicio = novoNo;
        quant++;
    }

    public void inserirFim(No novoNo) {
        if (inicio == null) {
            inicio = novoNo;
        }
        novoNo.setAnterior(fim);
        fim.setProximo(novoNo);
        fim = novoNo;

    }

    @Override
    public String toString() {
        return "ListaDupEnc = " + this.inicio.getAnterior() + " -> " + this.inicio;
    }

    public void inserirApos(No novoNo, No elemento) {
        No aux = inicio;
        boolean inserir = false;
        while ((aux != null) && (inserir == false)) {
            if (inicio == null) {
                System.out.println("Lista Vazia!");
            } else if ((aux.getElemento() == elemento.getElemento())) {
                if (aux == fim) {
                    fim = novoNo;
                }
                novoNo.setProximo(aux.getProximo());
                novoNo.setAnterior(aux);
                aux.getProximo().setAnterior(novoNo);
                aux.setProximo(novoNo);
                quant++;
                inserir = true;
            } else {
                aux = aux.getProximo();
            }
        }
        if (inserir == false) {
            System.out.println("Elemento nÃ£o encontrado!");
        }
    }

    public void removerNoInicio() {
        No aux;
        if (inicio == null) {
            System.out.println("Lista Vazia!");
        } else {
            aux = inicio.getProximo();
            aux.setAnterior(null);
            inicio = aux;
            quant--;
        }
    }

    public void removerNoMeio(No elemento) {
        No aux = inicio;
        No ant = null;
        while (aux != null) {
            if ((aux.getElemento() == elemento.getElemento())) {

                if (ant == null) {
                    this.removerNoInicio();
                }

                if (aux.getProximo() == null) {
                    this.removerNoFim();
                } else {
                    ant.setProximo(aux.getProximo());
                }
                aux = null;
            } else {
                ant = aux;
                aux = aux.getProximo();
            }
        }
    }

    public void removerNoFim() {
        No aux = fim;
        fim = aux.getAnterior();
        fim.setProximo(null);
    }

    public No getInicio() {
        return this.inicio;
    }

    public No getFim() {
        return this.fim;
    }

    public void inserirAlfa(No novoNo) {
        boolean inseriu = false;
        No aux = inicio;
        if ((inicio == null) || (novoNo.getElemento().compareTo(inicio.getElemento()) < 0)) {
            inserirInicio(novoNo);
        } else if (novoNo.getElemento().compareTo(fim.getElemento()) > 0) {
            inserirFim(novoNo);
        } else {
            while ((aux.getProximo() != null) && inseriu == false) {
                if ((novoNo.getElemento().compareTo(aux.getElemento()) >= 0) && (novoNo.getElemento().compareTo(aux.getProximo().getElemento()) <= 0)) {
                    novoNo.setProximo(aux.getProximo());
                    aux.setProximo(novoNo);
                    novoNo.getProximo().setAnterior(novoNo);
                    novoNo.setAnterior(aux);
                    inseriu = true;
                } else {
                    aux = aux.getProximo();
                }
            }
        }
    }


}
