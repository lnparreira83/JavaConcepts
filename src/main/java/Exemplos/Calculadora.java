package Exemplos;

import java.util.Scanner;


public class Calculadora {
    public static void main(String args[]){
        int operacao = 0;
        double numero1 = 0.0;
        double numero2 = 0.0;

        while(operacao!=5){
            System.out.println("Escolha uma operação: ");
            System.out.println("1 = Soma, 2 = Multiplicação, 3 - Divisão, 4 - Subtração, 5 - Sair :");
            Scanner s = new Scanner(System.in);
            operacao = s.nextInt();
            if(operacao==5) System.exit(operacao);
            System.out.println("informe o primeiro numero: ");
            numero1 = s.nextDouble();
            System.out.println("informe o segundo numero: ");
            numero2 = s.nextDouble();

            if (operacao == 1) System.out.println(soma(numero1,numero2));
            else if(operacao == 2) System.out.println(multiplicacao(numero1,numero2));
            else if (operacao == 3) System.out.println(divisao(numero1,numero2));
            else if (operacao == 4) System.out.println(subtracao(numero1, numero2));

            System.out.println("Good Job!");
        }
    }


    public static double soma(double numero1, double numero2) {
        double total = 0.0;
        total = numero1 + numero2;

        return total;
    }

    public static double multiplicacao(double numero1, double numero2){
        double total = 0.0;
        total = numero1 * numero2;

        return total;
    }

    public static double divisao(double numero1, double numero2){
        double total = 0.0;
        if (numero1 > 0){
            total = numero1 / numero2;
        } else {
            System.out.println("Numero1 menor que 0");
        }
        return total;
    }

    public static double subtracao(double numero1, double numero2){
        double total = 0.0;
        total = numero1 - numero2;

        return total;
    }

}
