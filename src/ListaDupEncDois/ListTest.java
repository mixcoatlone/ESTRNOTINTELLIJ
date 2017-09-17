package ListaDupEncDois;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class ListTest {

    public static void main(String[] args) {
        Caixa no1 = new Caixa();
        no1.setElemento(10);

        Caixa no2 = new Caixa();
        no2.setElemento(28);

        Caixa no3 = new Caixa();
        no3.setElemento(56);

        Caixa no4 = new Caixa();
        no4.setElemento(12);


        OperLista s = new OperLista();
        s.adicionarnofim(no1);
        s.adicionarnofim(no2);
        s.adicionarnofim(no3);
        s.imprimirElementos();

        System.out.println("\n");
        s.adicionarnoinicio(no4);
        s.imprimirElementos();

        System.out.println("\n");
        s.removerElemento(4);
        s.removerElemento(3);
        s.removerElemento(2);
        s.removerElemento(1);
        s.removerElemento(0);


        s.imprimirElementos();


    }

}
