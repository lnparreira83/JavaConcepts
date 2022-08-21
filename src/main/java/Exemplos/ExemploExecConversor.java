package Exemplos;

import java.util.*;

public class ExemploExecConversor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius: ");
        double tempC = sc.nextDouble();
        sc.close();
        CelsiusKelvin ck = new CelsiusKelvin();
        System.out.println("ck : " + ck);
        double tempK = ck.converter(tempC);
        System.out.println("tempK = " + tempK + "K");
        KelvinCelsius kelvinCelsius = new KelvinCelsius();
        tempC = kelvinCelsius.converter(tempK);
        System.out.println("tempC = " + tempC + "C");
    }
}
