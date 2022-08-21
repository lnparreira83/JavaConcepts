package Exemplos;

import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String args[]){
        String letra;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe uma letra: ");
        letra = s.next();
        if (letra.length() > 0) {
            switch (letra.toLowerCase()){
                case "a":
                    System.out.println("Letra a");
                    break;
                case "e":
                    System.out.println("Letra e");
                    break;
                case "i":
                    System.out.println("Letra i");
                    break;
                case "o":
                    System.out.println("Letra o");
                    break;
                case "u":
                    System.out.println("Letra u");
                    break;
                default:
                    System.out.println("Nao foi informada uma letra.");
            }
        } else {
            System.out.println("Nao foi informado valor");
        }

    }
}
