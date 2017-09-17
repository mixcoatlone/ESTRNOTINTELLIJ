package ListaDupEncQuatro;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class TesteList {

    public static void main(String[] args) {
        ListaAlfabetica no = new ListaAlfabetica();
        No noo = new No("Junior");

        no.inserirAlfa(noo);
        no.inserirAlfa(new No("AmÃ©rico"));
        no.inserirAlfa(new No("Oswaldo"));
        no.inserirAlfa(new No("Dalva"));
        no.inserirAlfa(new No("Pedro"));
        no.inserirAlfa(new No("FÃ¡tima"));
        no.inserirAlfa(new No("Fatima"));
        no.inserirAlfa(new No("Junior"));

        System.out.println(no.toString());
    }
}
