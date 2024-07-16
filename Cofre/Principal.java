package Cofre;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        Menu menu = new Menu();
        String opcao = "1";
        String opcaoDeSaida = "0";
 

        while (opcao != opcaoDeSaida) {
            opcao = menu.exibirMenu();
            switch (opcao) {
                case "1":

                    Menu menuMoedas = new Menu();
                    menuMoedas.menuAdicionarMoedas();

                    String opcaoMenuMoedas = teclado.next();

                    System.out.println("Digite o Valor: ");
                    Double valorDigitado = teclado.nextDouble();

                    if (opcaoMenuMoedas.equals("1")) {
                        Real moedaReal = new Real(valorDigitado);
                        cofrinho.adicionar(moedaReal);
                    }

                    else if (opcaoMenuMoedas.equals("2")) {
                        Dolar moedaDolar = new Dolar(valorDigitado);
                        cofrinho.adicionar(moedaDolar);
                    }

                    else if (opcaoMenuMoedas.equals("3")) {
                        Euro moedaEuro = new Euro(valorDigitado);
                        cofrinho.adicionar(moedaEuro);

                    } else {
                        System.out.println("Opção De Moeda Inválida...");
                    }

                    continue;

                case "2":

                    System.out.println("Selecione a Moeda: ");
                    menu.menuAdicionarMoedas();

                    String opcaoMenuRemoverMoeda = teclado.next();

                    System.out.println("Digite o Valor: ");
                    Double valorParaSerRemovido = teclado.nextDouble();

                    if (opcaoMenuRemoverMoeda.equals("1")) {
                        Real moedaReal = new Real(valorParaSerRemovido);
                        cofrinho.remover(moedaReal);
                    }

                    else if (opcaoMenuRemoverMoeda.equals("2")) {
                        Dolar moedaDolar = new Dolar(valorParaSerRemovido);
                        cofrinho.remover(moedaDolar);
                    }

                    else if (opcaoMenuRemoverMoeda.equals("3")) {
                        Euro moedaEuro = new Euro(valorParaSerRemovido);
                        cofrinho.remover(moedaEuro);

                    } else {
                        System.out.println("Opção De Moeda Inválida...");
                    }

                    

                    continue;

                case "3": 

                    cofrinho.listagemMoedas();
                
                    continue;

                
                case "4":
                    cofrinho.totalConvertido();

                    continue;

                case"0":

                System.out.println("Encerrando o programa...");
                break;

                default:
                    
                 break;

            
                    
                
            }

            break;
        }
    }

}