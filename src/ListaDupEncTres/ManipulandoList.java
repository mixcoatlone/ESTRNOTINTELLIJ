package ListaDupEncTres;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class ManipulandoList {

    private NoList inicio;
    private NoList fim;
    private NoList auxiliar;
    private int qtd;
    int i, c;

    private int tamanhodalinha;
    private int tamanhodacoluna;

    public ManipulandoList() {
        this.inicio = null;
        this.fim = null;
        this.qtd = 0;
        this.auxiliar = null;
        this.i = 0;
        this.c = 0;

    }

    public void insere(int linha, int coluna, double valor) {

        NoList no = new NoList();
        no.setLinha(linha);
        no.setColuna(coluna);
        no.setValor(valor);
        // deve estar fora

        if ((linha <= getTamanhototaldalinha()) && (coluna <= getTamanhototaldacoluna())) {
            if (i < getTamanhototaldacoluna() + 1) {
                if (vazia()) {
                    fim = no;
                    inicio = no;
                    qtd++;
                    i++;
                } else {
                    this.fim.setProx(no);
                    //  no.setAnt(fim);
                    i++;
                }
                this.fim = no;
                qtd++;
                c = c + i;
            } else {
                //inserindo em ordem
                i = 0;
                if (c == 5) {
                    inicio.setAnt(no);
                    auxiliar = inicio;
                } else {
                    auxiliar.setAnt(no);
                    auxiliar = no;

                }

                fim = no;

            }
        }
    }

    public void adicionarnoinicio(NoList no) {
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

    public void adicionarnofim(NoList no) {

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
        NoList percorre = inicio;
        NoList auxiliar = inicio;
        int contador = 0;
        while (contador != (getTamanhototaldacoluna() * getTamanhototaldalinha())) {
            while (percorre != null) {
                System.out.println("[" + percorre.getLinha() + " " + percorre.getColuna() + "] " + percorre.getValor());
                percorre = percorre.getProx();
                contador++;
            }
            if (percorre == null) {
                if (contador == getTamanhototaldacoluna()) {
                    auxiliar = inicio.getAnt();

                } else {
                    auxiliar = auxiliar.getAnt();
                }

                percorre = auxiliar;
            }

        }
    }

    public void removerElemento(int posicaoNoRemover) {
        int cont = 1;
        NoList percorre = inicio;
        NoList aux = percorre;

        while (percorre != null) {

            if ((posicaoNoRemover > 0 && posicaoNoRemover <= qtd) && (cont == posicaoNoRemover)) {
                if (percorre == inicio) {
                    inicio = aux.getProx();

                } else if (percorre == fim) {
                    fim = aux;
                    aux.setProx(null);

                } else {
                    aux.setProx(percorre.getProx());
                }
                System.out.println("O elemento  " + percorre.getValor() + " foi removido com sucesso! ");
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
        if (cont != posicaoNoRemover) {
            System.out.println("NÃ£o existe a posiÃ§Ã£o " + posicaoNoRemover + "  na Lista");
        }

    }

    public boolean vazia() {
        return (inicio == null) && (fim == null);
    }

    public int getTamanhototaldalinha() {
        return tamanhodalinha;
    }

    public void setTamanhototaldalinha(int tamanhototaldalinha) {
        this.tamanhodalinha = tamanhototaldalinha;
    }

    public int getTamanhototaldacoluna() {
        return tamanhodacoluna;
    }

    public void setTamanhototaldacoluna(int tamanhototaldacoluna) {
        this.tamanhodacoluna = tamanhototaldacoluna;
    }

}
