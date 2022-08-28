package Colecoes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploColecao {
    public static class Consumer1 implements Consumer<String>{

        @Override
        public void accept(String e) {
            if(e.startsWith("L")) { System.out.println("[L] " + e); }
        }

        @Override
        public Consumer<String> andThen(Consumer<? super String> after) {
            return Consumer.super.andThen(after);
        }
    }
    public static void main(String args[]){
        List<String> lista = Arrays.asList("Banana","Laranja","Pera");
        lista.forEach(System.out::println);
        lista.forEach(new Consumer1());
        lista.forEach((e) -> {
            if(e.length() > 5) { System.out.printf("%s (%d)\n",e, e.length()); }
        });
    }
}
