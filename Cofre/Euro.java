package Cofre;

public class Euro extends Moeda{
    
    public Euro(Double valor) {
        this.valor = valor;
    }

    public void info() {
        System.out.println("Moeda de Euro: " + this.valor);
    }

    public double converter() {
        return this.valor * 5.5;
    }

    @Override
    public boolean equals(Object verificador) {
        if (this == verificador) {
            return true;
        }
    

        if (verificador == null || !(verificador instanceof Euro)) {
            return false;
        }
    

        Euro verificadorDeEuro = (Euro) verificador;
    

        return Double.compare(this.valor, verificadorDeEuro.valor) == 0;
    }

}
