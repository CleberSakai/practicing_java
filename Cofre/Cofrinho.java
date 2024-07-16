package Cofre;

import java.util.LinkedList;

public class Cofrinho {
    
    private LinkedList<Moeda> ListaMoedas = new LinkedList<>();


    public void Cofrinho() {
        this.ListaMoedas = new LinkedList<>();
    }

    public void adicionar(Moeda moeda) {
        this.ListaMoedas.add(moeda);
    }

    public void remover(Moeda moeda) {
         this.ListaMoedas.remove(moeda);
    }

    public void listagemMoedas(){
        for(Moeda moeda : this.ListaMoedas) {
            moeda.info();
        } 
    }

    int soma = 0;

    public void totalConvertido() {
        for(Moeda moeda : this.ListaMoedas) {

            soma += moeda.converter();

        }

        System.out.println("O valor convertido é: " + soma);

        
    }

    

}
