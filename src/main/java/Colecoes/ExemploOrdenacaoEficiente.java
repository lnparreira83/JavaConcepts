package Colecoes;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoEficiente {
    public static void main(String a[]){
        final int MAX = 50_000;
        String data[] = new String[MAX];
        for(int i = data.length - 1; i >= 0; i--){
            data[i] = "" + (MAX - i);
        }
        String xtra[] = new String[data.length];
        long inicio, fim;
        System.arraycopy(data, 0, xtra, 0, data.length);
        inicio = System.currentTimeMillis();
        ExemploOrdenacao.sort(xtra); // usa a classe de ordenação
        fim = System.currentTimeMillis();
        System.out.println("Tempo Ordenacao.sort = " + (fim - inicio));
        System.arraycopy(data,0,xtra,0,data.length);
        inicio = System.currentTimeMillis();
        Arrays.sort(xtra);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Arrays.sort = " + (fim - inicio));
        List<String> lista = Arrays.asList(data);
        inicio = System.currentTimeMillis();
        Collections.sort(lista);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Collections.sort = " + (fim - inicio));
    }
}
