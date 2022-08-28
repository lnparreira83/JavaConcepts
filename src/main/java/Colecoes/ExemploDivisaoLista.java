package Colecoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExemploDivisaoLista {
    public static void main(String a[]){
        List<String> lista = new ArrayList<>();
        for(int i=0;i<a.length; i++){
            lista.add(a[i]);
        }
        System.out.println("Lista " + lista);
        List<String> terco = lista.subList(0, lista.size() / 3);
        List<String> resto = lista.subList(lista.size()/3, lista.size());
        System.out.println("Terco " + terco);
        System.out.print("listIterator(): ");
        ListIterator<String> l = terco.listIterator(terco.size());
        while(l.hasPrevious()){
            System.out.print(l.previousIndex() + "=" + l.previous() + " ");
        }
        System.out.println();
        System.out.println("Resto " + resto);
        System.out.print("iterator():");
        Iterator<String> i = resto.iterator();
        while(i.hasNext()){
            System.out.print(" " + i.next());
        }
        System.out.println();
    }
}
