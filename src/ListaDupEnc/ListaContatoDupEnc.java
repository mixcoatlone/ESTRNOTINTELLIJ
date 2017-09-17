package ListaDupEnc;

import java.util.Scanner;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class ListaContatoDupEnc {

    private NoContato inicio;
    private NoContato fim;
    private int qtd, op, auxiliarentrada;
    private String novo;


    private Scanner in;

    public int getQtdNo() {
        return qtd;
    }

    public NoContato getInicio() {
        return inicio;
    }

    public void setInicio(NoContato inicio) {
        this.inicio = inicio;
    }

    public ListaContatoDupEnc() {
        this.in = new Scanner(System.in);
        this.inicio = null;
        this.fim = null;
        this.qtd = 0;
        this.novo = null;
    }

    public void inserirNoInicio(NoContato no) {
        if (vazia()) {

            fim = no;
            inicio = no;
            qtd++;
        } else {
            no.setProx(inicio);
            no.setAnt(null);
            inicio.setAnt(no);
            inicio.setProx(inicio.getProx());
            inicio = no;
            qtd++;
        }

    }

    public void inserirNoFim(NoContato no) {
        if (vazia()) {
            inicio = no;
            fim = no;
            qtd++;
        } else {
            fim.setProx(no);
            no.setAnt(fim);
            no.setProx(null);
            fim = no;
            qtd++;
        }

    }

    public void alterarContato(String nomeParaBuscar) {
        NoContato percorre = inicio;

        while (percorre != null) {

            if (percorre.getNome().equalsIgnoreCase(nomeParaBuscar)) {
                System.out.println("COntato Encontrado!!!");

                do {
                    System.out.println("\t\nO  Que voce deseja alterar?"
                            + "\t\nDigite o numero da opÃ§Ã£o : "
                            + "\t\n1--Nome "
                            + "\t\n2--Local de trabalho "
                            + "\t\n3--Telefones "
                            + "\t\n4--Endereco "
                            + "\t\n5--Data de Nascimento"
                            + "\t\n6--terminar alteraÃ§Ãµes e sair!!!");
                    op = in.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Novo Nome:");
                            novo = in.nextLine();
                            novo = in.nextLine();
                            percorre.setNome(novo);
                            break;
                        case 2:
                            System.out.println("Novo Local de Trabalho:");
                            novo = in.nextLine();
                            novo = in.nextLine();
                            percorre.setLocaldetrabalho(novo);
                            break;
                        case 3:
                            if (percorre.getQtdtelefones() == 1) {
                                System.out.println("Voce so possui um telefone cadastrado\nSe desejar alterar este telefone ja cadastrado--digite 1\n Se quiser adicionar outro telefone--digite 2 ");
                                auxiliarentrada = in.nextInt();
                                if (auxiliarentrada == 1) {
                                    System.out.println("Digite 1---para alterar o numero do telefone 1 formato(12345678) ou digite [0] para removÃª-lo deste contato : ");
                                    auxiliarentrada = in.nextInt();
                                    if (auxiliarentrada == 1) {
                                        System.out.println("Digite o novo numero do telefone 1 formato(12345678) : ");
                                        auxiliarentrada = in.nextInt();
                                        percorre.setTelefone1(auxiliarentrada);
                                    } else if (auxiliarentrada == 0) {
                                        percorre.setTelefone1(0);
                                        percorre.setQtdtelefones(0);
                                    }

                                } else if (auxiliarentrada == 2) {
                                    percorre.setQtdtelefones(2);
                                    System.out.println("Digite o numero do telefone 2 formato(12345678) : ");
                                    percorre.setTelefone2(in.nextInt());
                                }

                            } else if (percorre.getQtdtelefones() == 2) {
                                System.out.println("Qual dos dois telefones deseja alterar: \n1--telefone 1 \n 2--telefone 2 ?");
                                auxiliarentrada = in.nextInt();

                                if (auxiliarentrada == 1) {
                                    System.out.println("Digite 1---para alterar o numero do telefone 1 formato(12345678) ou digite [0] para removÃª-lo deste contato : ");
                                    auxiliarentrada = in.nextInt();
                                    if (auxiliarentrada == 1) {
                                        System.out.println("Digite o novo numero do telefone 1 formato(12345678) : ");
                                        auxiliarentrada = in.nextInt();
                                        percorre.setTelefone1(auxiliarentrada);
                                    } else if (auxiliarentrada == 0) {
                                        percorre.setTelefone1(0);
                                        percorre.setQtdtelefones(1);
                                        percorre.setTelefone1(percorre.getTelefone2());
                                    }
                                } else if (auxiliarentrada == 2) {
                                    System.out.println("Digite 1---para alterar o numero do telefone 2 formato(12345678) ou digite [0] para removÃª-lo deste contato : ");
                                    auxiliarentrada = in.nextInt();
                                    if (auxiliarentrada == 1) {
                                        System.out.println("Digite o novo numero do telefone 2 formato(12345678) : ");
                                        auxiliarentrada = in.nextInt();
                                        percorre.setTelefone2(auxiliarentrada);
                                    } else if (auxiliarentrada == 0) {
                                        percorre.setTelefone2(0);
                                        percorre.setQtdtelefones(1);
                                    }
                                }

                            } else {
                                System.out.println("NÃ£o existe telefones cadastrados para este contato,deseja cadastrar novo(s) telefone \n1--SIM\n2--NAO?");
                                auxiliarentrada = in.nextInt();
                                if (auxiliarentrada == 1) {
                                    System.out.println("Digite quantos telefones ele(a) possui? ");
                                    percorre.setQtdtelefones(in.nextInt());
                                    if (percorre.getQtdtelefones() == 1) {
                                        System.out.println("Digite o numero do telefone 1 formato(12345678) : ");
                                        percorre.setTelefone1(in.nextInt());
                                    } else if (percorre.getQtdtelefones() == 2) {
                                        System.out.println("Digite o numero do telefone 1 formato(12345678) : ");
                                        percorre.setTelefone1(in.nextInt());
                                        System.out.println("Digite o numero do telefone 2 formato(12345678) : ");
                                        percorre.setTelefone2(in.nextInt());
                                    } else {
                                        System.out.println(" nao pode ser adicionado mais do que dois telefones");
                                    }
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Novo Endereco:");
                            novo = in.nextLine();
                            novo = in.nextLine();
                            percorre.setEnderecocompleto(novo);
                            break;
                        case 5:
                            System.out.println(percorre.getDia() + "/" + percorre.getMes() + "/" + percorre.getAno());
                            System.out.println("O que voce quer alterar ?"
                                    + "\n1-dia(31)"
                                    + "\n2-mes(12)"
                                    + "\n3-ano(9999)");
                            auxiliarentrada = in.nextInt();
                            if (auxiliarentrada == 1) {
                                System.out.println("Digite o novo dia de nascimento");
                                percorre.setDia(in.nextInt());
                            } else if (auxiliarentrada == 2) {
                                System.out.println("Digite o novo mes de nascimento");
                                percorre.setMes(in.nextInt());
                            } else if (auxiliarentrada == 3) {
                                System.out.println("Digite o novo ano de nascimento");
                                percorre.setAno(in.nextInt());
                            }

                            break;
                        case 6:
                            System.out.println("***Saiu****");
                            break;
                    }
                    System.out.println("Deseja continuar alterando este contato: \n1--SIM\n2--NAO");
                    if (in.nextInt() == 2) {
                        op = 6;
                        System.out.println("***Saiu***");
                    }
                } while ((op > 0 && op <= 5));

                break;
            }
            percorre = percorre.getProx();
        }
        if (percorre == null) {
            System.out.println("Contato Inexistente!//nao existe este nome");
        }
    }

    public void buscarcontatoporNome(String nomeParaBuscar) {

        NoContato percorre = inicio;

        while (percorre != null) {
            if (percorre.getNome().equalsIgnoreCase(nomeParaBuscar)) {
                System.out.println("COntato Encontrado!!!"
                        + "\t\nCod: " + percorre.getCod()
                        + "\t\nNome: " + percorre.getNome()
                        + "\t\nLocal de trabalho: " + percorre.getLocaldetrabalho()
                        + "\t\nTelefones: " + percorre.getTelefone1() + " | " + percorre.getTelefone2()
                        + "\t\nEndereco: " + percorre.getEnderecocompleto()
                        + "\t\nData de Nascimento: " + percorre.getDia() + "/" + percorre.getMes() + "/" + percorre.getAno());
                break;
            }
            percorre = percorre.getProx();
        }
        if (percorre == null) {
            System.out.println("Contato Inexistente!//nao existe este nome");
        }
    }

    public void buscarcontatoporTelefone(int numerotelefone) {
        NoContato percorre = inicio;

        while (percorre != null) {
            if (percorre.getTelefone1() == numerotelefone || percorre.getTelefone2() == numerotelefone) {

                System.out.println("COntato Encontrado!!!"
                        + "\t\nCod: " + percorre.getCod()
                        + "\t\nNome: " + percorre.getNome()
                        + "\t\nLocal de trabalho: " + percorre.getLocaldetrabalho()
                        + "\t\nTelefones: " + percorre.getTelefone1() + " | " + percorre.getTelefone2()
                        + "\t\nEndereco: " + percorre.getEnderecocompleto()
                        + "\t\nData de Nascimento: " + percorre.getDia() + "/" + percorre.getMes() + "/" + percorre.getAno());
                break;
            }
            percorre = percorre.getProx();
        }
        if (percorre == null) {
            System.out.println("Contato Inexistente!//nÃ£o exite este telefone");
        }
    }

    public void imprimirContatos() {
        NoContato percorre = inicio;
        if (percorre == null) {
            System.out.println("Nao existem contatos Cadastrados");
        }
        while (percorre != null) {
            if (percorre.getQtdtelefones() == 1) {
                System.out.println(""
                        + "\t\nCod: " + percorre.getCod()
                        + "\t\nNome: " + percorre.getNome()
                        + "\t\nLocal de trabalho: " + percorre.getLocaldetrabalho()
                        + "\t\nTelefone: " + percorre.getTelefone1()
                        + "\t\nEndereco: " + percorre.getEnderecocompleto()
                        + "\t\nData de Nascimento: " + percorre.getDia() + "/" + percorre.getMes() + "/" + percorre.getAno());

            } else if (percorre.getQtdtelefones() == 2) {
                System.out.println(""
                        + "\t\nCod: " + percorre.getCod()
                        + "\t\nNome: " + percorre.getNome()
                        + "\t\nLocal de trabalho: " + percorre.getLocaldetrabalho()
                        + "\t\nTelefones: " + percorre.getTelefone1() + " | " + percorre.getTelefone2()
                        + "\t\nEndereco: " + percorre.getEnderecocompleto()
                        + "\t\nData de Nascimento: " + percorre.getDia() + "/" + percorre.getMes() + "/" + percorre.getAno());

            } else {
                System.out.println(""
                        + "\t\nCod: " + percorre.getCod()
                        + "\t\nNome: " + percorre.getNome()
                        + "\t\nLocal de trabalho: " + percorre.getLocaldetrabalho()
                        + "\t\nEndereco: " + percorre.getEnderecocompleto()
                        + "\t\nData de Nascimento: " + percorre.getDia() + "/" + percorre.getMes() + "/" + percorre.getAno());

            }
            percorre = percorre.getProx();

        }

    }
//fallta terminar

    public void removercontatoporNome(String nomeParaRemover) {
//primeiro buscarnome depois rmover

        NoContato percorre = inicio;
        NoContato aux = percorre;
        buscarcontatoporNome(nomeParaRemover);

        while (percorre != null) {

            if (percorre.getNome().equalsIgnoreCase(nomeParaRemover)) {
                if (percorre == inicio) {
                    inicio = aux.getProx();

                } else if (percorre == fim) {
                    fim = aux;
                    aux.setProx(null);

                } else {
                    aux.setProx(percorre.getProx());
                }
                System.out.println("O Contato " + percorre.getNome() + " foi removido com sucesso! ");
                percorre.setProx(null);
                percorre.setAnt(null);
                percorre = null;
                qtd--;
                break;
            } else {
                aux = percorre;
                percorre = percorre.getProx();
            }

        }
    }

    public void consultaraniverdomes(int mes,ListaContatoDupEnc lista) {

        ListaContatoDupEnc lista2 = new ListaContatoDupEnc();
        NoContato percorre = lista.getInicio();

        NoContato adicaonalista2 = null;
        NoContato andar = lista2.getInicio();
        NoContato andaraux = andar;

        while (percorre != null) {
            if (percorre.getMes() == mes) {
                if (andaraux == null) {
                    NoContato no2 = new NoContato();
                    adicaonalista2 = percorre;
                    adicaonalista2.setProx(null);
                    adicaonalista2.setAnt(null);

                    no2 =percorre;
                    andar = adicaonalista2;
                    andaraux = adicaonalista2;

                    lista2.inserirNoFim(no2);
                } else {
                    andar = lista2.getInicio();
                    while (andar != null) {

                        if (percorre.getDia() < andar.getDia()) {
                            if (andar == lista2.getInicio()) {
                                NoContato no2 = new NoContato();
                                no2 = percorre;
                                lista2.inserirNoInicio(no2);
                            } else {
                                NoContato no2 = new NoContato();
                                no2 = percorre;
                                no2.setAnt(andar.getAnt());
                                no2.setProx(andar);
                                andar.getAnt().setProx(no2);
                                andar.setAnt(no2);
                            }
                            break;

                        } else if ((percorre.getDia() > andar.getDia()) && (andar.getProx() == null)) {
                            NoContato no2 = new NoContato();
                            no2 = percorre;
                            lista2.inserirNoFim(no2);
                            break;
                        }

                        andar = andar.getProx();

                    }

                }

            }
            percorre = percorre.getProx();
        }

        percorre = lista2.getInicio();
        while (percorre != null) {

            System.out.println(""
                    + "\t\nCod: " + andar.getCod()
                    + "\t\nNome: " + andar.getNome()
                    + "\t\nLocal de trabalho: " + andar.getLocaldetrabalho()
                    + "\t\nTelefones: " + andar.getTelefone1() + " | " + andar.getTelefone2()
                    + "\t\nEndereco: " + andar.getEnderecocompleto()
                    + "\t\nData de Nascimento: " + andar.getDia() + "/" + andar.getMes() + "/" + andar.getAno());
            percorre = percorre.getProx();
        }

    }

    public boolean vazia() {
        return (inicio == null) && (fim == null);
    }


}
