package ListaDupEncDois;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class OperLista {


    private Caixa inicio;
    private Caixa fim;
    private int qtd;

    public OperLista() {
        this.inicio = null;
        this.fim = null;
        this.qtd = 0;
    }

    public void adicionarnoinicio(Caixa no) {
        if (vazia()) {

            fim = no;
            inicio = no;
            qtd++;
        } else {
            no.setProx(inicio);
            inicio.setAnt(no);
            this.inicio = no;
            this.qtd++;
        }

    }

    public void adicionarnofim(Caixa no) {

        if (vazia()) {
            inicio = no;
        } else {
            this.fim.setProx(no);
            no.setAnt(fim);

        }
        this.fim = no;
        qtd++;

    }

    public void imprimirElementos() {
        Caixa percorre = inicio;

        while (percorre != null) {
            System.out.println("elemento:" + percorre.getElemento());
            percorre = percorre.getProx();
        }
    }

    public void removerElemento(int posicaoNoRemover) {

        int cont=1;
        Caixa percorre = inicio;
        Caixa aux = percorre;

        while (percorre != null) {

            if ((posicaoNoRemover>0 && posicaoNoRemover<=qtd)&&(cont == posicaoNoRemover)) {
                if (percorre == inicio) {
                    inicio = aux.getProx();

                } else if (percorre == fim) {
                    fim = aux;
                    aux.setProx(null);

                } else {
                    aux.setProx(percorre.getProx());
                }
                System.out.println("O elemento  "+percorre.getElemento()+" foi removido com sucesso! ");
                percorre.setProx(null);
                percorre.setAnt(null);
                percorre = null;
                qtd--;
                break;
            } else {
                cont++;
                aux = percorre;
                percorre = percorre.getProx();
            }

        }
        if(cont!=posicaoNoRemover ){
            System.out.println("Nao existe a posicao "+ posicaoNoRemover  +"  na Lista");
        }

    }

    public boolean vazia() {
        return (inicio == null) && (fim == null);
    }

}
