package Exemplos;

import java.util.*;

public class ExemploSwitch02 {
    public static void main(String args[]){
        int ndias;
        int mes;

        Scanner s = new Scanner(System.in);
        System.out.println("Informe o numero do mes [1-12] : ");
        mes = s.nextInt();
        try{
            ndias = switch (mes){
                case 1,3,5,7,8,10,12 -> 31;
                case 4,6,9,11 -> 30;
                default -> 28 + (Calendar.getInstance().get(Calendar.YEAR)%4==0 ? 1 : 0);
            };

            System.out.printf("Mes #%d tem %d dias.\n", mes, ndias);
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }


    }
}
