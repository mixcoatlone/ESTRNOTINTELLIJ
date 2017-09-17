package ListaDupEnc;

import java.util.Scanner;

/**
 * Created by BRUNO on 14/09/2017.
 */
public class ListaContato {
    public static void main(String[] args) {
        int op, i, contadorparacodigo = 1;
        String aux;

        ListaContatoDupEnc lista = new ListaContatoDupEnc();

        Scanner dado = new Scanner(System.in);
        do {
            System.out.println("\n\t:::: Agenda :::::\nOpcoes: \n1-Cadastrar Contato \n2-Remover Contato\n3-Alterar Contato \n4-Consultar Contato por nome\n5- Consultar Contato por telefone \n6- Consulta Aniversariante do mÃªs \n7-Vizualizar Contatos \n0-Sair \n\t digite a opÃ§Ã£o:");

            op = dado.nextInt();


            switch (op) {
                case 1:

                    NoContato no1 = new NoContato();

                    no1.setCod(contadorparacodigo);

                    System.out.println("Digite o Nome Completo(nome+sobrenomedomeio+sobrenomedofim) e sem acentos : \n");
                    aux = dado.nextLine();
                    aux = dado.nextLine();
                    no1.setNome(aux);

                    System.out.println("Digite o local de trabalho: \n");
                    aux = dado.nextLine();
                    no1.setLocaldetrabalho(aux);

                    int e;
                    do {
                        System.out.println("Digite quantos telefones ele(a) possui? ");
                        no1.setQtdtelefones(dado.nextInt());
                        if (no1.getQtdtelefones() > 2) {
                            System.out.println("voce nao pode adicionar mais de 2 telefones");
                            System.out.println("deseja continuar adicionando telefones 1/sim 2/nao ? ");
                            e = dado.nextInt();
                            if (e == 1) {
                                System.out.println("Digite quantos telefones ele(a) possui? ");
                                no1.setQtdtelefones(dado.nextInt());
                            } else {
                                break;
                            }
                        }

                        if (no1.getQtdtelefones() == 1) {
                            System.out.println("Digite o numero do telefone 1 formato(12345678) : ");

                            no1.setTelefone1(dado.nextInt());
                            break;
                        } else if (no1.getQtdtelefones() == 2) {
                            System.out.println("Digite o numero do telefone 1 formato(12345678) : ");
                            no1.setTelefone1(dado.nextInt());
                            System.out.println("Digite o numero do telefone 2 formato(12345678) : ");
                            no1.setTelefone2(dado.nextInt());

                            break;
                        }
                    } while (no1.getQtdtelefones() >= 1 && no1.getQtdtelefones() <= 2);

                    System.out.println("Digite o endereco completo(rua,numero,bairro,cep): ");
                    aux = dado.nextLine();
                    aux = dado.nextLine();
                    no1.setEnderecocompleto(aux);
                    System.out.println("Digite a data de nascimento ");
                    System.out.println("dia(31) ");
                    i = dado.nextInt();
                    no1.setDia(i);
                    System.out.println("mes(12)");
                    i = dado.nextInt();
                    no1.setMes(i);
                    System.out.println("ano(9999)");
                    i = dado.nextInt();
                    no1.setAno(i);
                    contadorparacodigo++;

                    lista.inserirNoFim(no1);
                    break;
                case 2:
                    System.out.println("Digite o nome completo(nome+sobrenomedomeio+sobrenomedofim)  e sem acentos da pessoa quer voce quer remover");
                    aux = dado.nextLine();
                    aux = dado.nextLine();
                    lista.removercontatoporNome(aux);
                    break;
                case 3:
                    System.out.println("Digite o nome completo(nome+sobrenomedomeio+sobrenomedofim) e sem acentos da pessoa quer voce quer alterar");
                    aux = dado.nextLine();
                    aux = dado.nextLine();
                    lista.alterarContato(aux);
                    break;
                case 4:
                    System.out.println("Digite o nome completo(nome+sobrenomedomeio+sobrenomedofim) e sem acentos da pessoa quer voce quer encontrar");
                    aux = dado.nextLine();
                    aux = dado.nextLine();
                    lista.buscarcontatoporNome(aux);
                    break;

                case 5:
                    System.out.println("Digite o numero do telefone formato(12345678) para encontrar o contato desejado: ");
                    lista.buscarcontatoporTelefone(dado.nextInt());
                    break;
                case 6:
                    System.out.println("Digite o mes com para saber quem e os aniversariantes dele: "
                            + "\njan - 1"
                            + "\nfev -  2"
                            + "\nmar - 3"
                            + "\nabr - 4"
                            + "\nmaio - 5"
                            + "\njunho - 6"
                            + "\njulho - 7"
                            + "\nagost - 8"
                            + "\nset - 9"
                            + "\nout - 10"
                            + "\nnov - 11"
                            + "\ndez - 12"
                            + "");
                    i = dado.nextInt();
                    lista.consultaraniverdomes(i,lista);
                    break;
                case 7:
                    lista.imprimirContatos();
                    break;
                case 0:
                    System.out.println("Logoff efetuado com sucesso!!!!!!!!");
                    break;

            }

        } while (op > 0 && op <= 7);

    }



}
