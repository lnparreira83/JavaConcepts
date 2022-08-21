package Exemplos;

import Fibonacci.ExemploFibonacci;
import static Fibonacci.ExemploFibonacci.fibonacci;

public class ExemploExecFibonProg {
    public static void main(String args[]){
        ExemploFibonacci fibonacci = new ExemploFibonacci();
        ExemploProgressao progressao = new ExemploProgressao();

        System.out.println(fibonacci(9));
        System.out.println(progressao.aritmetica(2,2,4));
    }
}
