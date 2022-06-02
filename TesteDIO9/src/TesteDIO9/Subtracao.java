package TesteDIO9;

public class Subtracao implements Operacoes {
    
    @Override
    public Double calcular(int x, int y) {
    
        double resultado = x - y;
        return resultado;
    }
}
