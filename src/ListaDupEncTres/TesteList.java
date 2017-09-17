package ListaDupEncTres;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class TesteList {

    public static void main(String[] args) {



        ManipulandoList s = new ManipulandoList ();
        s.setTamanhototaldalinha(1);
        s.setTamanhototaldacoluna(4);
        s.insere(1, 1, 23);
        s.insere(1, 2, 25);
        s.insere(1, 3, 27);
        s.insere(1, 4, 29);

        s.insere(2, 1, 5);
        s.insere(2, 2, 6);
        s.insere(2, 3, 7);
        s.insere(2, 4, 8);


        s.imprimirElementos();

        System.out.println("\n");








    }


}
