package Exemplos;

import java.util.*;

public class ExemploAssert {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Forneça inteiro maior que 9: ");
        int valor = sc.nextInt();
        assert valor > 9;
        int soma = 0;
        for(int i=1; i < valor; i++){
            soma += i;
            assert soma < 99 : "soma(" + soma + ") >=99";
        }
        System.out.println("soma[1.." + valor + "] =" + soma);
        sc.close();
    }
}
