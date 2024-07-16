package Cofre;

public class Dolar extends Moeda {
    
    public Dolar(Double valor) {
        this.valor = valor;
    }

    public void info() {
        System.out.println("Moeda de Dolar: " + this.valor);
    }

    public double converter() {
        return this.valor * 5;
    }

    @Override
    public boolean equals(Object verificador) {
        if (this == verificador) {
            return true;
        }
    

        if (verificador == null || !(verificador instanceof Dolar)) {
            return false;
        }
    

        Dolar verificadorDeDolar = (Dolar) verificador;
    

        return Double.compare(this.valor, verificadorDeDolar.valor) == 0;
    }

}
