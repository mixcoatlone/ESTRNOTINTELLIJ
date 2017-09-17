package ListaDupEnc;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class NoContato {

    private String nome, localdetrabalho, enderecocompleto;
    private int telefone1, telefone2, dia, mes, ano, qtdtelefones, cod;
    private NoContato prox, ant;


    public NoContato() {
        this.prox = null;
        this.ant = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(int telefone1) {
        this.telefone1 = telefone1;
    }

    public int getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }


    public NoContato getProx() {
        return prox;
    }

    public void setProx(NoContato prox) {
        this.prox = prox;
    }

    public NoContato getAnt() {
        return ant;
    }

    public void setAnt(NoContato ant) {
        this.ant = ant;
    }

    public String getLocaldetrabalho() {
        return localdetrabalho;
    }

    public void setLocaldetrabalho(String localdetrabalho) {
        this.localdetrabalho = localdetrabalho;
    }

    public String getEnderecocompleto() {
        return enderecocompleto;
    }

    public void setEnderecocompleto(String enderecocompleto) {
        this.enderecocompleto = enderecocompleto;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public int getQtdtelefones() {
        return qtdtelefones;
    }

    public void setQtdtelefones(int qtdtelefones) {
        this.qtdtelefones = qtdtelefones;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
