package Cofre;

public class Real extends Moeda {
    
    public Real(Double valor) {
        this.valor = valor;
    }

    public void info() {
        System.out.println("Moeda de Real: " + this.valor);
    }

    public double converter() {
        return this.valor;
    }

    @Override
    public boolean equals(Object verificador) {
        if (this == verificador) {
            return true;
        }
    

        if (verificador == null || !(verificador instanceof Real)) {
            return false;
        }
    

        Real verificadorDeReal = (Real) verificador;
    

        return Double.compare(this.valor, verificadorDeReal.valor) == 0;
    }
    

}
