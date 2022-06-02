package TesteDIO9;

public class Principal {
    
    public static void main(String[] args) {
    
       Divisao divisao = new Divisao();
       Multiplicacao multiplicao = new Multiplicacao();
       Soma soma = new Soma();
       Subtracao subtracao = new Subtracao();

       Integer a = 20;
       Integer b = 10;

        System.out.println(divisao.calcular(a,b)) ;
        System.out.println(multiplicao.calcular(a,b));
        System.out.println(soma.calcular(a,b));
        System.out.println(subtracao.calcular(a,b));

    }
}
