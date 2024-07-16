package Cofre;

import java.util.Scanner;

public class Menu {

    public String exibirMenu() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1 - Adicionar Moedas");
        System.out.println("2 - Remover Moedas");
        System.out.println("3 - Listar Moedas");
        System.out.println("4 - Converter valor para real");
        System.out.println("0 - Encerrar Programa");

        String opcao = teclado.next();
        return opcao;
    }

    public void menuAdicionarMoedas() {
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
    }

}
